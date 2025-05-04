package org.example.section1.generics;

import java.util.Scanner;

public class GenericImplementation {
    /** Generic is used to give datatype as a parameter for the class during the compilation
     * time imstead of declaring while writing code
     * It is used for code reusability*/
    public static <T> void swap(T[] arr,int i,int j)
    {
        T temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Integer[] arr=new Integer[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        swap(arr,1,2);
        for(int i:arr)
        {
            System.out.println(i);
        }
        String[] names=new String[5];

            for(int i=0;i<5;i++)
            {
                names[i]=sc.next();
            }
            swap(names,1,2);
            for(String s:names)
            {
                System.out.println(s);
            }



    }
}
