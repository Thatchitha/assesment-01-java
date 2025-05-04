package org.example.section1;

public class EqualsCheck {
    public static void main(String[] args) {
        /**  == used to check whether the values  based on address in string
          but for other data types like int,char it checks the value

         equals() is used to check the actual values in the object */
        String str1="Raju";
        String str2="Raju";
        String str3=new String("Raju");
        //print the == operation result
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        //print the equals operation result
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        int n=10;
        int n1=10;
        System.out.println(n==n1);

    }


}
