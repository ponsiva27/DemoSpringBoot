package com;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class TestController {
    
      @GetMapping("/print")
    public void printWord() {
        System.out.println("Hi Ponsiva , Wow!! you created your first API ...!!");
    }
    
    @GetMapping("/add")
    public String addNum() {
        return "10+98";
    }
    
}
