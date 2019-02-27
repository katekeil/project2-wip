package com.kate;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String title;
        String description;
        int priority;
        int showChoice;
        String yeetTask;
        String titleGet;
        String newTitle;
        String newDes;
        int newPri;
        int selection = 5;

        Scanner titleIn = new Scanner(System.in);
        Scanner descriptionIn = new Scanner(System.in);
        Scanner priorityIn = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);
        Scanner show = new Scanner(System.in);
        Scanner remove = new Scanner(System.in);
        Scanner get = new Scanner(System.in);
        Scanner newT = new Scanner(System.in);
        Scanner newD = new Scanner(System.in);
        Scanner newP = new Scanner(System.in);

        HashMap<String, ToDo> info = new HashMap<>();

        while (selection != 0){

            System.out.println("Welcome to your to-do list! What would you like to do?");
            System.out.println("(1) Add a task");
            System.out.println("(2) Remove a task");
            System.out.println("(3) Edit a task");
            System.out.println("(4) Show to-do list");
            System.out.println("(0) Exit");

            selection = choice.nextInt();

            //Add a task
            if (selection == 1){
                System.out.println("What would you like the title to be?");
                title = titleIn.nextLine();

                System.out.println("What is a description of the task?");
                description = descriptionIn.nextLine();

                System.out.println("What is the priority of the task? (0-5 with 0 being lowest priority and 5 being the highest)");
                priority = priorityIn.nextInt();

                ToDo task = new ToDo(title, description, priority);

                info.put(title, task);
            }

            //Remove a task
            if (selection == 2){
                System.out.println("Enter the title of the task you want to remove.");
                yeetTask = remove.nextLine();

            }

            //Edit a task
            if (selection == 3){
                System.out.println("Enter the title of the task you want to edit.");
                titleGet = get.nextLine();
                String val = info.get(titleGet).toString();
                System.out.println("Enter a new title: ");
                newTitle = newT.nextLine();
                ToDo.;
                System.out.println("Enter a new description: ");
                newDes = newD.nextLine();
                info.put(description, newDes);
                System.out.println("Enter a new priority: ");
                newPri = newP.nextInt();
                info.put(priority, newPri);
            }

            //Show to-do list
            if (selection == 4){
                System.out.println("Would you like to (1)Show entire list or (2)Show all items under a specific priority level?");
                showChoice = show.nextInt();
                if (showChoice == 1){
                    System.out.println(info.toString());
            }

                if (showChoice == 2){
                    System.out.println("Enter the priority level you would like to show (0-5).");
                }

            }
        }
    }
}
