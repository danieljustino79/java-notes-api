package com.sb2.javanotesapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/publications")
public class PublicationController {
    @GetMapping
    public String get(){
        return "SpringBoot REST..";
    }
}
