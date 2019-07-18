package com.crcc.ribbon.config;

import com.crcc.ribbon.annotation.ExcludeComponentScan;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dell on 2019/7/11.
 */
@Configuration
@ExcludeComponentScan
public class RibbonConfig {

    @Bean
    public IRule ribbonRule(){
        return new RoundRobinRule();
    }
}
