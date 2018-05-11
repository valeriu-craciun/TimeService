package ro.cognitive.timeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.cognitive.timeservice.model.TimeModel;
import ro.cognitive.timeservice.model.TimeModelV2;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TimeController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/v2/getTime")
    public TimeModelV2 getTime2() {
        return new TimeModelV2(counter.incrementAndGet());
    }

    @RequestMapping("/v1/getTime")
    public TimeModel getTime1() {
        return new TimeModel(counter.incrementAndGet());
    }

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Salut ba, " + name + "!";
    }

}
