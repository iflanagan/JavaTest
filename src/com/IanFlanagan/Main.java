package com.IanFlanagan;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello Rollbar lets send some errors to you");
        genHash(15);

        int value = 0;

        try
        {
            value = 1 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Error " +e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Done");
        }

    }
    public static void unhandledErrors() {

        int quotient = 0;

        try {

            quotient = 1 / 0;

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }


    public static String genHash(int length) {

        // create a string of lowercase characters and numbers
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        // concatentate  strings
        String alphaNumeric =  lowerAlphabet + numbers;
        // create random string builder object
        StringBuilder sb = new StringBuilder();
        // create an object of Random class
        Random random = new Random();

        for(int i = 0; i < length; i++) {
            // generate random index number
            int index = random.nextInt(alphaNumeric.length());
            // get character specified by index
            // from the string
            char randomChar = alphaNumeric.charAt(index);
            // append the character to string builder
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        System.out.println("Random String is: " + randomString);
        return randomString;

    }


    public static void genArrayOutofBounds() {

        System.out.println("Calling genArrayOutofBounds() method");
        ArrayList<String> lis = new ArrayList<>();
        lis.add("My");
        lis.add("Name");
        System.out.println(lis.get(2));
    }

}

