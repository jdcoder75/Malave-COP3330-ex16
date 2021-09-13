package org.example;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Jose Malave
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        final int minAge = 16;

        System.out.println( "What is the username?" );
        String ageIn= sc.nextLine();

        int currentAge = Integer.parseInt(ageIn);
        if(currentAge >= minAge)
        {
            System.out.println( "You are old enough to legally drive." );
        }
        else
        {
            System.out.println( "You are not old enough to legally drive." );
        }

    }
}
