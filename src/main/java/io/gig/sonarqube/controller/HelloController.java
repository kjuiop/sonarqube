package io.gig.sonarqube.controller;

import io.gig.sonarqube.service.HelloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : JAKE
 * @date : 2023/07/12
 */
@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("api/hello")
    public String hello(String name) {

        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException();
        }

        return helloService.sayHello(name);
    }
}
