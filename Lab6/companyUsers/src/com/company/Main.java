package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Map<String, List<String>> CompaniesAndEmployees = new HashMap<>();

        while (!line.equals("End")) {
            String[] cmd = line.split(" -> ");
            String company = cmd[0];
            String id = cmd[1];

            if (!CompaniesAndEmployees.containsKey(company)) {
                List<String> ids = new ArrayList<>();
                ids.add(id);
                CompaniesAndEmployees.put(company, ids);
            } else {
                List<String> ids = CompaniesAndEmployees.get(company);
                if (!ids.contains(id)) {
                    ids.add(id);
                    CompaniesAndEmployees.put(company, ids);
                }
            }

            line = in.nextLine();
        }
//
//
//        for (List<String> employees : CompaniesAndEmployees.values()) {
//            Collections.sort(employees);
//        }

        CompaniesAndEmployees.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey())).forEach(es -> {
            System.out.println(es.getKey());
            for (String id : es.getValue()) {
                System.out.println("-- " + id);
            }
        });
    }
}
