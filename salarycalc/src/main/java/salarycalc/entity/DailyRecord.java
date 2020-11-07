package salarycalc.entity;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

/**
 * DailyRecord
 */
public class DailyRecord {

    private String Id;
    private OffsetDateTime workInTime;
    private OffsetDateTime workOutTime;

    /**
     * disable defult constractor
     */
    private DailyRecord(){
    }

    public DailyRecord(OffsetDateTime workInTime, OffsetDateTime workOutTime) {
        this.Id = UUID.randomUUID().toString();
        this.workInTime = workInTime;
        this.workOutTime = workOutTime;
    } 

    public String getId () {
        return this.Id;
    }

    public Long getWorkingMinutes() {
        return workInTime.until(workOutTime, ChronoUnit.MINUTES);
    }
}