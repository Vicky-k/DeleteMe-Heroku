package com.example.demoheroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
final class DemoHerokuController {

    @GetMapping("/")
    Iterable<Object>  getList() {
        return Collections.emptyList();
    }

}
