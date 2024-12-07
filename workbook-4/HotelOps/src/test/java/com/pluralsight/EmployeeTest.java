package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchIn_InitialPunchIn_punchInIsStartTime() {
        //Arrange
        Employee employee1 = new Employee(07, "T.I", "Tech", 20);
        double time = 14.00;
        double expectedStartTime = 14.00;

        //Act
        employee1.punchIn(time);

        //Assert
        double actualPunchInTime = employee1.getStartTime();
        assertEquals(expectedStartTime, actualPunchInTime);
    }

    @Test
    public void punchOut_durationFromStartToEndTime_ExactDurationTime() {
        //Arrange
        Employee employee2 = new Employee(20, "Goku", "Bandai", 70);
        double startTime = 8.30;
        double endTime = 16.30;
        double duration = 8;
        double expectedDuration = 8;
        employee2.punchIn(startTime);

        //Act
        employee2.punchOut(endTime);

        //Assert
        double actualPunchOutDuration = employee2.getHoursWorked();
        assertEquals(expectedDuration,actualPunchOutDuration);
    }

}