package ro.cognitive.timeservice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ro.cognitive.timeservice"})
public class TimeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeServiceApplication.class, args);
    }
}
