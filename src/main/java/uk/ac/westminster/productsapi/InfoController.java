package uk.ac.westminster.productsapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String Info() {
        return "Products API is a Spring Boot REST API used to create, view, update, and delete product information.";
    }
}
