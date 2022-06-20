package com.hodolog.api.controller;


import com.hodolog.api.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PostController {

    // Http Method
    // GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, CONNECT

    // 글 등록
    // POST Method


    @PostMapping("/posts")
    public String post(@RequestBody PostCreate params) {
        log.info("params={}", params.toString());
        return "Hello World";
    }


    // SSR -> jsp, thymeleaf, mustache, freemarker
    // -> html rendering
    // SPA ->
    // -> javascript + <-> API (JSON)
    // vue, nuxt.js
    // react, next.js
}
