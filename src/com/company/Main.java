package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private static void showMenu() {
        System.out.println("Menu");
        System.out.println("--------------------");
        System.out.println("1 - Add person");
        System.out.println("2 - Delete person");
        System.out.println("3 - Show personal data");
        System.out.println("4 - Edit person");
        System.out.println("5 - Save");
        System.out.println("6 - EXIT");
        System.out.println();
    }

    private static void showMessage(int which) {
        switch(which) {
            case 1: System.out.print("Give me Name: "); break;
            case 2: System.out.print("Give me Surname"); break;
            case 3: System.out.print("Give me ID"); break;
            case 4: System.out.println("Give file name: "); break;
            case 5: showMenu(); break;
        }
    }

    public static void main(String[] args) throws IOException {
        HashSet<Person> people = new HashSet<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Give file name: ");
        String fileName = input.nextLine();

        File file = new File("C://Users//Mati//Desktop//" + fileName + ".txt");

        FileWriter writer = new FileWriter(file);

        showMenu();

        int choose = input.nextInt();
        String n, s;  //n - name   s - surname   id - ID
        int id;

        while(choose != 6) {
            switch(choose) {
                case 1: {
                    Person p = new Person();
                    p.setID(people.size());

                    showMessage(1);
                    n = input.nextLine();
                    p.setName(n);

                    showMessage(2);
                    s = input.nextLine();
                    p.setSurname(s);

                    people.add(p);
                    writer.write("ID:" + p.getID() + "|Name:" + p.getName() + "|Surname:" + p.getSurname());
                } break;

                case 2: {
                    showMessage(3);
                    id = input.nextInt();

                    Person p = new Person();
                    p.setID(id);

                    people.remove(p);
                } break;

                case 3: {
                    showMessage(3);
                    id = input.nextInt();

                    Person p = new Person();
                    p.setID(id);

                    if(people.contains(p)) {
                        //TODO
                    }

                    else System.out.println("Nobody with this ID was founded");
                } break;

                case 4: {
                    showMessage(3);
                    id = input.nextInt();

                    Person p = new Person();
                    p.setID(id);

                    if(people.contains(p)) {
                        //TODO
                    }

                    else System.out.println("Nobody with this ID was founded");
                } break;
            }

            showMessage(5);
            choose = input.nextInt();
        }

        writer.close();
    }
}
