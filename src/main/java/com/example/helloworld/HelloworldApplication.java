package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import java.lang.Thread;

@SpringBootApplication
@Controller
@GetMapping("/cat/message")
public class HelloworldApplication {

    @RestController
    class HelloworldController {
        @GetMapping(value = "security", method = RequestMethod.GET)
        public void doGet() {
            System.out.println("这是get方法！");
        }

        @GetMapping(value = "security", method = RequestMethod.POST)
        // post方法用于接收微信服务端消息
        public void DoPost() {
            System.out.println("这是post方法！");
        }
    }

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
