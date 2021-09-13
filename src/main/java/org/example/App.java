/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String userCar = keyboardInput.nextLine();

        if( userCar.equals("y") ){
            System.out.print("Are the battery terminals corroded?");
            userCar = keyboardInput.nextLine();
            if( userCar.equals("y") ){
                System.out.print("Clean the terminals and try starting again.");
            }
            else
                System.out.print("Replace cables and try again.");
            System.exit(0);

        }
        else {
            System.out.println("Does the car make a slicking noise?");
            userCar = keyboardInput.nextLine();
        }
            if( userCar.equals("y") ){
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else if( userCar.equals("n") ){
                System.out.println("Does the car crank up but fail to start?");
                userCar = keyboardInput.nextLine();
                if( userCar.equals("y") ){
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else if( userCar.equals("n") ){
                    System.out.println("Does the engine start and then die?");
                    userCar = keyboardInput.nextLine();
                    if( userCar.equals("y") ){
                        System.out.println("Does your car have fuel injection?");
                        userCar = keyboardInput.nextLine();
                        if( userCar.equals("y") ){
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else if( userCar.equals("n") ){
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else if( userCar.equals("n") ){
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }








