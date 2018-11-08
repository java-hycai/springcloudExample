package hycai.springcloud.eurakaserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
class EurakaserverApplication

fun main(args: Array<String>) {
    SpringApplication.run(EurakaserverApplication::class.java, *args)
}
