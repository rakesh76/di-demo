package sanghvi.springframework.didemo;

import org.junit.Before;
import org.junit.Test;
import sanghvi.springframework.didemo.controllers.PropertyInjectedController;
import sanghvi.springframework.didemo.controllers.SetterInjectController;
import sanghvi.springframework.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class SetterInjectionControllerTest {

    private SetterInjectController setterInjectionController;

    @Before
    public void setup(){
        setterInjectionController = new SetterInjectController();
        setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }


    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.SAY_HELLO, setterInjectionController.sayHello());
    }
}
