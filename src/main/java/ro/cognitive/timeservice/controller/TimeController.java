package ro.cognitive.timeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.cognitive.timeservice.model.TimeModel;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TimeController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/getTime")
    public TimeModel getTime() {
        return new TimeModel(counter.incrementAndGet());
    }
}
