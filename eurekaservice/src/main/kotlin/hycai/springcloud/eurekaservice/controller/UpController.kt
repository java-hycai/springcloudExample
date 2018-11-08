package hycai.springcloud.eurekaservice.controller

import hycai.springcloud.eurekaservice.commom.MyHealthChecker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController("/")
class UpController {

    @Autowired
     private lateinit var myHealthChecker: MyHealthChecker


    @RequestMapping("up")
    fun up(@RequestParam("up") up:Boolean):String{
        myHealthChecker.setUp(up)
        return up.toString()
    }
}