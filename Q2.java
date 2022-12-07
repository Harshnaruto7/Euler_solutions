package com.solution;

public class Q2 {
    public static void main(String[] args) {

          int num1=0;
        int num2=1;
        int sum=0;

        do {
            sum=num1+num2;
            num1=num2;
            num2=sum;
            if(sum%2==0) {
               // System.out.println(sum);
            }
        }while (num2<=4000000);
        System.out.println(sum);

    }
}
