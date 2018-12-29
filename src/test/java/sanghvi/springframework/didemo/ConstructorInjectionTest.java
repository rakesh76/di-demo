package sanghvi.springframework.didemo;

import org.junit.Before;
import org.junit.Test;
import sanghvi.springframework.didemo.controllers.ConstructorInjectedController;
import sanghvi.springframework.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectionTest {

    ConstructorInjectedController constructorInjectedController;

    @Before
    public void setup(){
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }


    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.SAY_HELLO, constructorInjectedController.sayHello());
    }
}
