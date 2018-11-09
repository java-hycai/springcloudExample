package hycai.springcloud.eurekaservice.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
class TestController {


    @RequestMapping("/hello")
    fun hello(): String {
        return "hellosdfsdf" + Date().time
    }

}