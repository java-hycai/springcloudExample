package hycai.springcloud.eurekaservice.service

import hycai.springcloud.eurekaservice.remotecall.HelloFeigenClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class CallService {

    @Autowired
    private lateinit var helloFeigenClient: HelloFeigenClient

    fun getHello():String{
      return  helloFeigenClient.getHello()
    }
}