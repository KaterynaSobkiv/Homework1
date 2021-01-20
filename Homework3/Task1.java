package Homework3;

import java.util.*;

public class Task1 {

    static String getAlphaNumericString(int n) {

        int lowerLimit = 97;
        int upperLimit = 122;

        Random random = new Random();

        StringBuffer r = new StringBuffer(n)
                ;

        for (int i = 0; i < n; i++) {

            int nextRandomChar = lowerLimit
                    + (int) (random.nextFloat()
                    * (upperLimit - lowerLimit + 1));

            r.append((char) nextRandomChar);
        }

        return r.toString();
    }

    public static void main(String[] args) {
        for (int n = 5; n < 16; n++)
            System.out.println(getAlphaNumericString(n));
    }
}