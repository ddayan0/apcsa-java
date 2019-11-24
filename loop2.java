// Dennis Dayan
// loop2.java

// froot loops

import java.lang.*;
import java.util.*;
public class loop2 {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++){
            System.out.println(i);
        }
        for(int i = 10; i >-1; i-- ){
            System.out.println(i);
        }
        for(int i = 10; i <= 100; i++){
            if(i % 10 == 0){
                System.out.println(i);
            }


        }
        for(int i = 0; i < 11; i++){
            System.out.println(Math.random());





    }
        for(String star = " "; star.length() < 22; star+= "*"){
            System.out.println(star);
        }

        Scanner scan = new Scanner(System.in);
        for(int i = scan.nextInt(); i<=100; i++){
            System.out.println(i);
        }



        Scanner name = new Scanner(System.in);
        Scanner xtimes = new Scanner(System.in);
//        for(String strname = name.next(); strname.length() < xtimes.nextInt(); strname+= strname ){
//            System.out.println(strname);
//        }
        String urname = name.next();
        int num = xtimes.nextInt();

        for(int i = 0; i < num; i++){
            System.out.println(urname);
        }

        //bonus
        String asterisk = "******";
        String numbers = "1234567";
        // yeah so looking at this its probable that I am going to have to do substrings. Only around 10 min left in class so,
        // not probably going to happen in that timeframe.











}}

