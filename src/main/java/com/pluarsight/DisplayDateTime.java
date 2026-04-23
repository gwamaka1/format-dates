package com.pluarsight;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;

public class DisplayDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime nowGmt = ZonedDateTime.now(ZoneOffset.UTC);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy  HH:mm");

        System.out.println(now.format(f1));
        System.out.println(now.format(f2));
        System.out.println(now.format(f3));
        System.out.println(nowGmt.format(f4));
      ;

    }
}
