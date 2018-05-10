package ro.cognitive.timeservice.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeModel {
    private final long id;
    private String theTime;


    public TimeModel(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getTheTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime now = LocalDateTime.now();
        this.theTime = dtf.format(now);
        return theTime;
    }
}
