package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Map<String, List<String>> CourcesAndStudents = new LinkedHashMap<>();


        while (!line.equals("end")) {
            String[] cmd = line.split(" : ");
            String cource = cmd[0];
            String student = cmd[1];
            List<String> students = new ArrayList<>();
            CourcesAndStudents.putIfAbsent(cource, students);
            students = CourcesAndStudents.get(cource);
            students.add(student);
            CourcesAndStudents.put(cource, students);

            line = in.nextLine();
        }

        CourcesAndStudents.entrySet().stream().sorted((es1, es2) -> {
            int count1 = es1.getValue().size();
            int count2 = es2.getValue().size();
            return Integer.compare(count2, count1);
        }).forEach((es) -> {
            System.out.println(es.getKey() + ": " + es.getValue().size());
            es.getValue().stream().sorted((e1, e2) -> e1.compareTo(e2)).forEach(e -> System.out.println("-- " + e));
        });

    }
}
