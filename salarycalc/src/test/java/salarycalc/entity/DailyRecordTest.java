package salarycalc.entity;

import static org.junit.Assert.*;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.junit.Test;

/**
 * DailyRecordTest
 */
public class DailyRecordTest {

    @Test
    public void getWorkingMinutesTest() {
        ZoneOffset timeZone = ZoneOffset.UTC;
        OffsetDateTime workInTime = OffsetDateTime.of(2020, 11, 1, 9, 0, 0, 0, timeZone);
        OffsetDateTime workOutTime = OffsetDateTime.of(2020, 11, 1, 17, 0, 0, 0, timeZone);
        DailyRecord entity = new DailyRecord(workInTime, workOutTime);
        assertEquals(Long.valueOf(480), entity.getWorkingMinutes());
    }
}