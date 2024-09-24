package com.ye.niveau1;

import java.util.Scanner;

public class Exo7Energiedefuture {
    public static void main(String[] args) {

        int months = 4 ;

        // get the input from the user
        Scanner input = new Scanner(System.in);
        int power = input.nextInt();

        /*
         * if power is divisible par 2 , do with 2
         * if power is divisible par 3 , do with 3
         * else substract -1 from the power and continue
         * return the rest of the power after 4 months
         */


        for ( int i = 0 ; i < months ; i++ ) {
            if ( power % 3 == 0 ) {
                power /= 3 ;
                System.out.printf( "Month %s : Power %s \n " , i + 1 , power );
            }else if ( power % 2 == 0 ) {
                power /= 2 ;
                System.out.printf( "Month %s : Power %s \n " , i + 1 , power );
            }else {
                power -= 1 ;
                System.out.printf( "Month %s : Power %s \n " , i + 1 , power );
            }
        }

        System.out.println("The rest of power after 4 months " + power );

    }
}
