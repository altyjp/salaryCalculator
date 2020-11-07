package salarycalc.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

/**
 * DailyRecord
 */
public class DailyRecord {

    private String Id;
    private LocalDate date;
    private ZoneOffset timeZone;
    public LocalTime workInTime;
    public LocalTime workOutTime;

    /** 法廷内労働時間 */
    Long LEAGAL_WORKING_LIMIT_MINUTS = Long.valueOf(480);

    public DailyRecord(LocalDate date, ZoneOffset timeZone ) {
        this.Id = UUID.randomUUID().toString();
        this.date = date;
        this.timeZone = timeZone;
    }

    public String getId () {
        return this.Id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public ZoneOffset getTimeZone() {
        return this.timeZone;
    }

    public Long getWorkingMinutes() {
        if (workInTime == null || workOutTime == null) {
            return null;
        }
        return workInTime.until(workOutTime, ChronoUnit.MINUTES);
    }
}