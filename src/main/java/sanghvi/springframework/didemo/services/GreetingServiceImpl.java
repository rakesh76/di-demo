package sanghvi.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String SAY_HELLO="Hi Hello !!!";

    @Override
    public String sayGreeting() {
        return SAY_HELLO;
    }
}

