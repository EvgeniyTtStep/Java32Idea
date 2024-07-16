package org.Balandiukov;

public class TimeConverter {

    public static void convert(int inputSeconds) {
    
        int days = inputSeconds / (24 * 3600);
        inputSeconds %= (24 * 3600);
    
        int hours = inputSeconds / 3600;
        inputSeconds %= 3600;
    
        int minutes = inputSeconds / 60;
        inputSeconds %= 60;
    
        System.out.println(days + " days");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(inputSeconds + " seconds");
    }
}  
