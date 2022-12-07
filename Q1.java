package com.solution;

public class Q1 {
    public static void main(String[] args) {

           int x=3;
   int b=5;
   int sum=0;

   for(int a=1;a<1000;a++){
       if(a%x==0 || a%b==0 ){
           System.out.println(a);

           sum +=a;

       }


         }
        System.out.println(sum);

    }
}
