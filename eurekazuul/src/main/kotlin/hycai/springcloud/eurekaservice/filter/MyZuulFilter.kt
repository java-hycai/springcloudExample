package hycai.springcloud.eurekaservice.filter

import com.netflix.zuul.ZuulFilter
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants
import org.springframework.stereotype.Component


@Component
class MyZuulFilter : ZuulFilter() {
    override fun run(): Any? {
        System.out.println("经过网关===========================")
        return null
    }

    override fun shouldFilter(): Boolean {
        return true
    }

    override fun filterType(): String {
        return FilterConstants.PRE_TYPE
    }

    override fun filterOrder(): Int {
        return 0
    }
}