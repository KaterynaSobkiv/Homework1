package Homework3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
class Task2 {
    public static void main(String args[]){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date: "+sdf.format(cal.getTime()));


        cal.add(Calendar.DAY_OF_MONTH, 7);
        String newDate = sdf.format(cal.getTime());
        System.out.println("Date after Addition: "+newDate);
    }
}
