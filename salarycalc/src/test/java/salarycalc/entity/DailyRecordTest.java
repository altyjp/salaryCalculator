package salarycalc.entity;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;

import org.junit.Test;

/**
 * DailyRecordTest
 */
public class DailyRecordTest {

    @Test
    public void getWorkingMinutesTest() {
        LocalDate date = LocalDate.of(2020, 11, 1);
        ZoneOffset timeZone = ZoneOffset.UTC;

        DailyRecord entity = new DailyRecord(date, timeZone);

        LocalTime workInTime = LocalTime.of(9, 0);
        LocalTime workOutTime = LocalTime.of(17, 0);
        entity.workInTime = workInTime;
        entity.workOutTime = workOutTime;

        assertEquals(Long.valueOf(480), entity.getWorkingMinutes());
    }
}