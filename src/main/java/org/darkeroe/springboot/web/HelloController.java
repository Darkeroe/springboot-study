package org.darkeroe.springboot.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON 반환 컨트롤러
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
