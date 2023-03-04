package com.fuguclub.javaproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (true) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Choose the function to run:" + System.lineSeparator() + "1- Capitalization" + System.lineSeparator() + "2- Reverse Capitalization" + System.lineSeparator() + "3- Reverse Words");
                String choose = sc.nextLine();

                String name = "";
                int nameInt = 0;

                switch (choose) {
                    case "1":
                        Capitalize c = new Capitalize();
                        System.out.println("Enter the words the divider:");
                        String divider = sc.nextLine();

                        while (!name.equals("/home")) {
                            System.out.println("Enter the words to capitalize:");
                            name = sc.nextLine();
                            if (!name.equals("/home")) {
                                if (divider.isEmpty()) {
                                    divider = " ";
                                }
                                c.capitalize(divider, name);
                            }
                        }
                        break;
                    case "2":
                        ReverseCapitalization rc = new ReverseCapitalization();

                        while (!name.equals("/home")) {
                            System.out.println("Enter the words with capitalization to reverse:");
                            name = sc.nextLine();
                            if (!name.equals("/home")) {
                                rc.capitalize(name);
                            }
                        }
                        break;
                    case "3":
                        ReverseWords rw = new ReverseWords();
                        while (!name.equals("/home")) {
                            System.out.println("Enter the words to reverse:");
                            name = sc.nextLine();
                            if (!name.equals("/home")) {
                                rw.reverse(name);
                            }
                        }
                        break;
                    case "4":
                        PrimeNumber pn = new PrimeNumber();
                        while (!name.equals("/home")) {
                            System.out.println("Entrer les nombres premier a trouver avant:");
                            name = sc.nextLine();
                            if (!name.equals("/home")) {
                                pn.find(Integer.parseInt(name));
                            }
                        }
                }
                if (choose.equals("/stop")) {
                    break;
                }
            }
        }

    }
}
