package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

    public static void main(String[] args) {
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MMM/dd/YYYY EEEE");

       LocalDate today =  LocalDate.now();
        System.out.println(today);

        System.out.println(  today.format(DF) );


        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);
        System.out.println(currentTime.format( TF ));

        LocalTime time1 = LocalTime.of(17, 25);
        System.out.println(time1);

        System.out.println( time1.format(TF) );


        System.out.println("----------------------------------------");

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY, EEEE hh:mm a");

        LocalDateTime a = LocalDateTime.now();

        System.out.println(a);
        System.out.println( a.format(DTF) );




    }


}


// MM/dd/YYYY: 7/22/2021
//