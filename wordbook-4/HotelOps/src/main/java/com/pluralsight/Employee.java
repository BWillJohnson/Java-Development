package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private  String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
        this.startTime= 0;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getStartTime(){
        return startTime;
    }
    public void punchIn() {
        LocalDateTime timeNow = LocalDateTime.now();
        int hour =timeNow.getHour();
        int minute =timeNow.getMinute();
        double time = hour + (minute/60);
        startTime = time;
    }
    public void punchOut(){
        LocalDateTime timeNow = LocalDateTime.now();
        int hour =timeNow.getHour();
        int minute =timeNow.getMinute();
        double duration = hour + (minute/60);
        hoursWorked += duration;
        duration = 0;
    }
    public void punchTimeCard(double time){
        if (startTime == 0) {
            startTime = time;
        } else {
            double duration = time - startTime;
            hoursWorked += duration;
            startTime = 0;
        }
    }
    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return (40 * payRate) + ((hoursWorked - 40) * (payRate * 1.5));
        }
    }


    public double getRegularHours(){
        if (hoursWorked <= 40){
            return hoursWorked;
        }else {
            return 40;
        }
    }
    public double getOverTimeHours(){
        if (hoursWorked>40){
            return hoursWorked - 40;
        }else {
            return 0;
        }
    }

}
