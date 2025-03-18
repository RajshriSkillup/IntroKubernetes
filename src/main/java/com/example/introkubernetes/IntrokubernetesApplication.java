package com.example.introkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
@SpringBootApplication
public class IntrokubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntrokubernetesApplication.class, args);
	}

}
@RestController
@RequestMapping("/")
class HelloController {
    @GetMapping
    public String hello() {
        String hostname;
        try {
            hostname = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            hostname = "unknown";
        }
        return "Hello world from " + hostname + "! Your app is up and running!\n";
    }
}
