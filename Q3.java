package com.solution;

public class Q3 {
    public static void main(String[] args) {
            long number =600851475143L;
        long newNum;
        for(long i=2;i<= number;i++){
            if(number%i==0){
                newNum=i;
                int counter=0;
                for(long j=newNum;j>=0;j--){
                    if(newNum%j==0){
                        counter++;
                    }

                }

                if(counter==2){
                    System.out.println(newNum);
                }
            }

        }


    }
}
