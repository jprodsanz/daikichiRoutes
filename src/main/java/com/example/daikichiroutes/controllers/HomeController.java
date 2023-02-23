package com.example.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
// by adding the request mapping here we don't have to repeat it after the slash
    @RequestMapping("daikichi")

public class HomeController {
    @RequestMapping("/")
        public String index() {
            return "Break 'em!";
    }
    @RequestMapping("/today")
        public String today() {
            return "Just wakin' up in the mornin', gotta thank God";
    }
    @RequestMapping("/tomorrow")
        public String tomorrow() {
            return "I don't know but today seems kinda odd";
    }
}
