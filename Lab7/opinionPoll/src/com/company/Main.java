package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person() {
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        List<Person> poll = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split(" ");
            Person person = new Person();
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            person.setName(name);
            person.setAge(age);
            poll.add(person);
        }

        poll.stream().filter(p -> p.getAge() > 30).sorted((p1, p2) -> {
            String count1 = p1.getName();
            String count2 = p2.getName();
            return count1.compareTo(count2);
        }).forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));

    }
}
