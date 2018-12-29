package sanghvi.springframework.didemo.controllers;

import sanghvi.springframework.didemo.services.GreetingService;

public class SetterInjectController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
