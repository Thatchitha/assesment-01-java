package org.example.section1.exceptionhandling;

public class Uncheckedexception {
   /** Unchecked exception occurs in runtime when there is a error in logic implementation of code it throws unchecked exception
     * Ex:Arithmetic exception,Nullpointer exception,classNotfoundException
    * ArithmeticException : it throws error when arithmetic operation logic is invalid */
   public static void main(String[] args) {
       int a=10;
       int b=0;
       try {
           System.out.println(a/b);
       }
       catch (ArithmeticException e)
       {
           System.out.println("dividend should not be Zero");
          // e.printStackTrace();
       }

   }
}
