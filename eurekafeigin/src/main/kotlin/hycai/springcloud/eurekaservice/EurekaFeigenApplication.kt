package hycai.springcloud.eurekaservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
class EurekaFeigenApplication {


    @Bean
    @LoadBalanced
    fun restTemplate():RestTemplate{
        return  RestTemplate()
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(EurekaFeigenApplication::class.java, *args)
}
