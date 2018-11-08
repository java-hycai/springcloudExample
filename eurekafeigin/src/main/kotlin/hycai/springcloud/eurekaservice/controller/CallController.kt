package hycai.springcloud.eurekaservice.controller

import hycai.springcloud.eurekaservice.service.CallService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController("/call")
class CallController {


    @Autowired
    private lateinit var callService: CallService

    @RequestMapping("/getHello")
    fun getHello(): String {
        return callService.getHello()
    }

}