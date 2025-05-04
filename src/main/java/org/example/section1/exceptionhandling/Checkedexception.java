package org.example.section1.exceptionhandling;

public class Checkedexception {
    /** Checked exception occurs in compile time of the programEx:IO exception,SQL exception
     *
     *
     *
     * */
    public static void main(String[] args) {
        System.out.println("Heloo");
        try {
            //waiting for 1 sec to print next statement
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Heloo");
    }
}
