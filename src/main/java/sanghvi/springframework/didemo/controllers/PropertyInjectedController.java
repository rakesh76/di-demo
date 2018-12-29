package sanghvi.springframework.didemo.controllers;

import sanghvi.springframework.didemo.services.GreetingService;
import sanghvi.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
