package hycai.springcloud.eurekaservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
class EurekaFeigenApplication

fun main(args: Array<String>) {
    SpringApplication.run(EurekaFeigenApplication::class.java, *args)
}
