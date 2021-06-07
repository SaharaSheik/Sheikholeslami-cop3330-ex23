package base;

/*

 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sahar Sheikholeslami

 */

/*
Exercise 23 - Troubleshooting Car Issues
An expert system is a type of artificial intelligence program that uses a
knowledge base and a set of rules to perform a task that a human expert might do.
Many websites are available that will help you self-diagnose a medical issue by answering a series of questions.
And many hardware and software companies offer online troubleshooting tools to help people solve simple technical
issues before calling a human.

Create a program that walks the user through troubleshooting issues with a car.
Use the following decision tree to build the system:

@startuml
if (Is the car silent when you turn the key?) then (yes)
    if (Are the battery terminals corroded?) then (yes)
        :Clean terminals and try starting again.;
        stop
    else (no)
        :Replace cables and try again.;
        stop
    endif
else (no)
    if (Does the car make a slicking noise?) then (yes)
        :Replace the battery.;
        stop
    else (no)
        if (Does the car crank up but fail to start?) then (yes)
            :Check spark plug connections.;
            stop
        else (no)
            if (Does the engine start and then die?) then (yes)
                if (Does you car have fuel injection?) then (yes)
                    :Get it in for service.;
                    stop
                else (no)
                    :Check to ensure the choke is opening and closing.;
                    stop
                endif
            else (no)
                :This should not be possible.;
                stop
            endif
        endif
    endif
endif
@enduml

Example Output
Is the car silent when you turn the key? y
Are the battery terminals corroded? n
The battery cables may be damaged.
Replace cables and try again.
Constraint
Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once.

Challenge
Investigate rules engines and inference engines.
These are powerful ways to solve complex problems that are based on rules and facts.
Identify a rules engine for your programming language and use it to solve this problem


 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;


        System.out.print("Is the car silent when you turn the key? ");
        answer = input.nextLine();

            if(answer.equals("y")) {
                System.out.print("Are the battery terminals corroded? ");
                answer = input.nextLine();

                if(answer.equals("y")){
                    System.out.print("Clean terminals and try starting again.");
                    System.exit(0);
                }else{

                    System.out.print("The battery cables may be damaged." + "\n"+ "Replace cables and try again.");
                    System.exit(0);
                }
            }else{
                System.out.print("Does the car make a slicking noise?");
                answer = input.nextLine();

                    if(answer.equals("y")) {
                        System.out.print("Replace the battery.");
                        System.exit(0);
                     }else{
                        System.out.print("Does the car crank up but fail to start?");
                        answer = input.nextLine();
                        if(answer.equals("y")) {
                            System.out.print("Check spark plug connections.");
                            System.exit(0);
                        }else{
                            System.out.print("Does the engine start and then die?");
                            answer = input.nextLine();
                            if(answer.equals("y")) {
                                System.out.print("Does you car have fuel injection?");
                                answer = input.nextLine();
                                if(answer.equals("y")){
                                    System.out.print("Get it in for service.");
                                    System.exit(0);
                                }else{
                                    System.out.println("Check to ensure the choke is opening and closing.");
                                    System.exit(0);

                                }

                            }else{
                                System.out.println("This should not be possible.");

                            }
                        }
                    }
            }



    }
}
