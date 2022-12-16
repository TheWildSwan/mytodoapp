package test.mytodoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todo {
    @GetMapping("/")
    String helloWorld() {
        return "To-Do Application !";
    }
}
