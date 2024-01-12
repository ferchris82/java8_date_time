package org.chrisferdev.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Día: " + fechaActual.getDayOfMonth());
        System.out.println("Mes: " + fechaActual.getMonth());
        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Día del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());
        
        fechaActual = LocalDate.of(2024, 1, 11);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.of(2024, Month.JANUARY, 11);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.parse("2024-01-11");
        System.out.println("fechaActual = " + fechaActual);

        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManiana = " + diaDeManiana);
        
        LocalDate mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnteriorMismoDia = " + mesAnteriorMismoDia);

        DayOfWeek jueves = LocalDate.parse("2024-01-11").getDayOfWeek();
        System.out.println("jueves = " + jueves);

        int once = LocalDate.of(2024, 01, 11).getDayOfMonth();
        System.out.println(once);
        
        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntes = LocalDate.of(2024, 01, 11).isBefore(LocalDate.parse("2024-02-11"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2024-01-11").isAfter(LocalDate.parse("2023-11-12"));
        System.out.println("esDespues = " + esDespues);

        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespues = " + esDespues);
    }
    
}
