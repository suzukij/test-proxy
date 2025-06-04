package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder,
                                           @Value("${proxy.target.uri}") String targetUri) {
        return builder.routes()
                .route("proxy", r -> r
                        .path("/proxy/**")
                        .filters(f -> f.rewritePath("/proxy(?<segment>/.*)", "${segment}"))
                        .uri(targetUri))
                .build();
    }
}
