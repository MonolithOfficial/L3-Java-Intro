package org.example;

public class Main {
    public static void main(String[] args) {
        // lines 7-13 literal initialization
        int numberB; // only declaration
        int a = 31; // initialization
        int number_of_circles = 5; // naming convention
        short someNumber = 45;
        int someInt = 77;
        long someLong = 4132500100L;
        float someFloat = 0.0f;
        double someDouble = 31.24;

        char someChar = 97; // same as char someChar = 'a';
        String someString = "ragac mnishvneloba"; // string literal
        String someOtherThing = "ragac mnishvneloba";

        // Function/Method call
        printCharArray(convertToCharArray(someString));

        boolean check = false; // primitive
        Boolean check2 = false; // wrapper class
        System.out.println(someChar);

        // primitive / low level array
        String[] someArray = {"str1", "target", "treasure", "str4"}; // hardcoded
        String[] uninitializedArray = new String[10]; // fixed size requirement

        // late initialization
        numberB = 51;

        // INCREMENTATION
        int x = 10;
        System.out.println(--x); // 9
        System.out.println(x--); // 10
        System.out.println(x++); // 10
        System.out.println(++x); // 11

        // LOOPS
        int index = 0;
        while (index <= 10) {
            if (index == 5) {
                break;
            }
            System.out.println(index);
            index++;
        }

        // will execute at least once in all cases
        do {
            System.out.println(index);
        } while (index <= 10);

        for (int k = 0; k < 12; k += 2){
            System.out.println(k);
        }

        boolean targetFound = false;
        boolean treasureFound = false;
        boolean somethingFound = false;
        int failCount = 0;
        for (int k = 0; k < someArray.length - 1; k++) {
            if (someArray[k].equals("target") && someArray[k].equals("treasure")) {
                somethingFound = true;
                break;
            } else {
                failCount++;
            }
            System.out.println(someArray[k]);
        }

        // foreach
        for (String element :
                someArray) {
            element += " addition";
            System.out.println(element);
        }

        if (somethingFound) {
            System.out.println("SOMETHING HAS BEEN FOUND");
        } else { // all other cases
            System.out.println("NO SOMETHING FOUND");
        }
    }

    public static char[] convertToCharArray(String str) {
        char[] charArray = str.toCharArray();
        return charArray;
    }

    public static void printCharArray(char[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            System.out.println(arr[j]);
        }
    }
}