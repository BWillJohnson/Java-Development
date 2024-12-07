package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDate.now();
        System.out.println(LocalDate.now());
        System.out.println("==============================");
        DateTimeFormatter FD = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String Date = LocalDate.now().format(FD);
        System.out.println(Date);
        System.out.println("===================================");
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String D2 = LocalDate.now().format(DTF);
        System.out.println(D2);
        System.out.println("=======================================");
        ;
        DateTimeFormatter FTD = DateTimeFormatter.ofPattern("EEE, MMM d, yyyy HH:ss ");
        String D3 = LocalDateTime.now().format(FTD);
        System.out.println(D3);
        System.out.println("===========================================");
        DateTimeFormatter TFD = DateTimeFormatter.ofPattern("H:ss on dd-MMM-yyyy");
        String D4 = LocalDateTime.now().format(TFD);
        System.out.println(D4);
    }
}
