package uk.ac.westminster.productsapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {
        return "Hello from SpringBoots";
    }

    @GetMapping("/status")
    public String Status() {
        return "API is running - " + LocalDate.now().toString();
    }

    @GetMapping("/goodbye")
    public String Goodbye() {
        return "Goodbye from SpringBoots";
    }

}
