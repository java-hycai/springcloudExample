package hycai.springcloud.eurekaservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class EurekaServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(EurekaServiceApplication::class.java, *args)
}
