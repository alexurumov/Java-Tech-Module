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
            
//            if(IsStudentExisting(students, firstName, lastName)) {
//                Student student = getStudent(students, firstName, lastName);
//                student.setFirstName(firstName);
//                student.setLastName(lastName);
//                student.setAge(age);
//                student.setHomeTown(homeTown);
//            } else {
//                Student student = new Student();
//                student.setFirstName(firstName);
//                student.setLastName(lastName);
//                student.setAge(age);
//                student.setHomeTown(homeTown);
//                students.add(student);
//            }

            Student student = students.stream()
                    .filter(s -> s.getFirstName().equals(firstName) && s.getLastName().equals(lastName))
                    .findFirst()
                    .orElse(null);

            if (student == null) {
                Student studentToAdd = new Student();
                studentToAdd.setFirstName(firstName);
                studentToAdd.setLastName(lastName);
                studentToAdd.setAge(age);
                studentToAdd.setHomeTown(homeTown);
                students.add(studentToAdd);
            } else {
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);
            }

            line = in.nextLine();
        }

        String filterCiry = in.nextLine();

        students.stream().filter(е -> е.getHomeTown().equals(filterCiry)).forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName() + " is " + e.getAge() + " years old"));

    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean IsStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
