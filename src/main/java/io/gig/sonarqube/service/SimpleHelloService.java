package io.gig.sonarqube.service;

import org.springframework.stereotype.Service;

/**
 * @author : JAKE
 * @date : 2023/07/12
 */
@Service
public class SimpleHelloService implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
