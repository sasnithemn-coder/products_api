package uk.ac.westminster.productsapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {
        return "Hello from SpringBoots";
    }

    @GetMapping("/status")
    public String Status() {
        return "API is running - Tutorial 1";
    }

    @GetMapping("/goodbye")
    public String Goodbye() {
        return "Goodbye from SpringBoots";
    }

}
