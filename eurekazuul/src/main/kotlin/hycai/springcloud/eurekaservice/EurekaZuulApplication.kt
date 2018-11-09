package hycai.springcloud.eurekaservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableZuulProxy
class EurekaZuulApplication {


    @Bean
    @LoadBalanced
    fun restTemplate():RestTemplate{
        return  RestTemplate()
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(EurekaZuulApplication::class.java, *args)
}
