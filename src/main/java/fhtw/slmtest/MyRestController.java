package fhtw.slmtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/api/square/{num}")
    public double square(@PathVariable double num){
        return num*num;
    }
}
