package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Student {
        String firstName;
        String lastName;
        int age;
        String homeTown;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        List<Student> students = new ArrayList<>();

        while (!line.equals("end")) {
            String[] input = line.split(" ");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            String homeTown = input[3];

            Student student = new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHomeTown(homeTown);

            students.add(student);

            line = in.nextLine();
        }

        String filterCiry = in.nextLine();

        students.stream().filter(е -> е.getHomeTown().equals(filterCiry)).forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName() + " is " + e.getAge() + " years old"));

    }
}
