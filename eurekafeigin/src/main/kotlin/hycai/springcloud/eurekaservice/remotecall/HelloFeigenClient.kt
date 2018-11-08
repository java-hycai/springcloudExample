package hycai.springcloud.eurekaservice.remotecall


import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient("HelloClient")
interface HelloFeigenClient {


    @RequestMapping("/hello")
    fun getHello():String
}
