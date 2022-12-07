package com.solution;
import java.lang.*;
public class Q5 {
    public static void main(String[] args) {



                int c=0,d=0;
                for(int i=1;i>0;i++)
                {
                    for(int j=1;j<=20;j++)
                    {
                        if(i%j==0)
                            c++;
                    }
                    if(c==20)
                    {
                        d=i;
                        break;
                    }
                    else
                        c=0;
                }
                System.out.println(d);






    }
}
