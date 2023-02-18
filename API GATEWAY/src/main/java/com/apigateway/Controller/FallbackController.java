package com.apigateway.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class FallbackController {
    @GetMapping("/userServiceFallback")
    public String userServiceFallback() {
        return "User service is down at this time !!";
    }

    @GetMapping("/contactServiceFallback")
    public String contactServiceFallback() {
        return "Contact service is down at this time";
    }
}
