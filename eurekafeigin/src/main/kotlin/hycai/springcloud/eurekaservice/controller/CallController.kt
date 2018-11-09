package hycai.springcloud.eurekaservice.controller

import hycai.springcloud.eurekaservice.service.CallService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/call")
@RestController
class CallController {


    @Autowired
    private lateinit var callService: CallService



    @RequestMapping("/getHello")
    fun getHello(): String {
        return callService.getHello()
    }


    @RequestMapping("/getHello2")
   fun getHello2():String{
        return callService.getHello2()
    }
}