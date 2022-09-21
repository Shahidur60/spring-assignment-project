package spring.com.demo.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @RequestMapping(value = "/Hello", method = RequestMethod.GET)
    public String sayHelloToUser(){
        return "Hello";
    }
}
