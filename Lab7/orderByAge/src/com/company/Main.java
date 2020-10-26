package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Person {
        String name;
        String ID;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        List<Person> people = new ArrayList<>();

        while (!line.equals("End")) {
            String[] input = line.split(" ");
            String name = input[0];
            String ID = input[1];
            int age = Integer.parseInt(input[2]);
            Person person = new Person();
            person.setName(name);
            person.setID(ID);
            person.setAge(age);
            people.add(person);

            line = in.nextLine();
        }

        people.stream().sorted((p1, p2) -> {
            int count1 = p1.getAge();
            int count2 = p2.getAge();
            return Integer.compare(count1, count2);
        }).forEach(p -> System.out.printf("%s with ID: %s is %d years old.\n", p.getName(), p.getID(), p.getAge()));
    }
}
