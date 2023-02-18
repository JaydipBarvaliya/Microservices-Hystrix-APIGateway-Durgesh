package com.user.controller;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserService;
import com.user.validations.ContactNumberConstraint;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.MonoOperator;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    private final RestTemplate restTemplate;
    private final WebClient.Builder webClientBuilder;

    public UserController(UserService userService, RestTemplate restTemplate, WebClient.Builder webClientBuilder) {
        this.userService = userService;
        this.restTemplate = restTemplate;
        this.webClientBuilder = webClientBuilder;
    }

    @GetMapping("/{userId}")
    public User getUser( @PathVariable("userId") Long userId) {

        User user = this.userService.getUser(userId);

        List<Contact> contact = this.restTemplate.getForObject("http://contact-service/contact/user/" + user.getUserId(), List.class);

        user.setContacts(contact);

        return user;










//        List webclientContacts =  webClientBuilder.build()
//                                              .get()
//                                              .uri("http://localhost:8082/contact/user/" + user.getUserId())
//                                              .retrieve()
//                                              .bodyToMono(List.class)
//                                              .block();




    }
}
