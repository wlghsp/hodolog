package com.hodolog.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/posts")
    public String get() {
        return "Hello World";
    }






    // SSR -> jsp, thymeleaf, mustache, freemarker
            // -> html rendering
    // SPA ->
            // -> javascript + <-> API (JSON)
    // vue, nuxt.js
    // react, next.js
}
