package hycai.springcloud.eurekaservice.service

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty
import hycai.springcloud.eurekaservice.remotecall.HelloFeigenClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class CallService {

    @Autowired
    private lateinit var helloFeigenClient: HelloFeigenClient

    @Autowired
    private lateinit var restTemplate: RestTemplate


    private var callUrl="http://HelloClient/hello"


    private var serviceEnable=true

    fun getHello():String{
      return  helloFeigenClient.getHello()
    }


    @HystrixCommand(fallbackMethod = "getHello2Error",threadPoolProperties = [
        HystrixProperty(name = "coreSize", value = "12")
    ]
    )
    fun getHello2():String{
        if(!serviceEnable){
            serviceEnable=!serviceEnable
            throw Exception("模拟服务不能访问")
        }
        serviceEnable=!serviceEnable
        return restTemplate.getForObject(callUrl,String::class.java)
    }

    fun getHello2Error():String{
      return "服务不可用"
    }
}