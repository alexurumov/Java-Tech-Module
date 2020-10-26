package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Map<String, List<Double>> StudentsAndGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String student = in.nextLine();
            Double grade = Double.parseDouble(in.nextLine());
            if (!StudentsAndGrades.containsKey(student)) {
                List <Double> grades = new ArrayList<>();
                grades.add(grade);
                StudentsAndGrades.put(student, grades);
            } else {
                List <Double> grades = new ArrayList<>();
                grades = StudentsAndGrades.get(student);
                grades.add(grade);
                StudentsAndGrades.put(student, grades);
            }
        }

        Map<String, Double> StudentsAveraged = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry: StudentsAndGrades.entrySet()) {
            Double average = calcAverage(entry.getValue());
            StudentsAveraged.put(entry.getKey(), average);
        }

        StudentsAveraged.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).filter(es -> es.getValue() >= 4.5).forEach(e -> {
            System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue());
        });

    }

    private static Double calcAverage(List<Double> values) {
        double result = 0;
        for (Double value : values) {
            result += value;
        }
        return result / values.size();
    }
}
