/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Prompt user for their name
    - Display a print message
    - End the Program
 */


import java.util.Scanner;

public class Solution01
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        String name;

        System.out.println("What is your name? ");
        name = Input.nextLine();

        System.out.println("Hello, "+ name +", Nice to meet you!");
    } // end main
}
