package hycai.springcloud.eurekaservice.commom

import org.springframework.stereotype.Component
import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.HealthIndicator

@Component
class MyHealthChecker : HealthIndicator {


    private var up = true

    override
    fun health(): Health {
        when (up) {
            true -> return Health.Builder().withDetail("aaa_cnt", 10) //自定义监控内容
                    .withDetail("bbb_status", "up").up().build()
            false -> return Health.Builder().withDetail("error", "client is down").down().build()
        }
    }

    fun isUp(): Boolean {
        return up
    }

    fun setUp(up: Boolean) {
        this.up = up
    }
}