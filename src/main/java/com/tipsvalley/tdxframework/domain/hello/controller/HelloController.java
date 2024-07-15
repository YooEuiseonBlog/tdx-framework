package com.tipsvalley.tdxframework.domain.hello.controller;

import com.tipsvalley.tdxframework.dao.Hello;
import com.tipsvalley.tdxframework.domain.hello.repository.HelloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class HelloController {
    private final HelloRepository helloRepository;
    @GetMapping
    public List<Hello> findAll() {
        return helloRepository.findAll();
    }
}
