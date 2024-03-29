package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
// import java.lang.Thread;

@SpringBootApplication
@Controller
@RequestMapping("/cat/message")
public class HelloworldApplication {

    @RestController
    class HelloworldController {
        @RequestMapping(value = "security", method = RequestMethod.GET)
        public void doGet() {
            System.out.println("这是get方法！");
        }

        @RequestMapping(value = "security", method = RequestMethod.POST)
        // post方法用于接收微信服务端消息
        public void DoPost() {
            System.out.println("这是post方法！");
        }
    }

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
