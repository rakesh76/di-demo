package sanghvi.springframework.didemo;

import org.junit.Before;
import org.junit.Test;
import sanghvi.springframework.didemo.controllers.PropertyInjectedController;
import sanghvi.springframework.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setup(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.SAY_HELLO, propertyInjectedController.sayHello());
    }

}
