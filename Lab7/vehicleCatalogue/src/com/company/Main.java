package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Vehicle {
        String type;
        String model;
        String color;
        int horsepower;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type.replace(type.charAt(0), Character.toUpperCase(type.charAt(0)));
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(int horsepower) {
            this.horsepower = horsepower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" + "Model: %s%n" + "Color: %s%n" + "Horsepower: %d", this.type, this.model, this.color, this.horsepower);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();

        while (!line.equals("End")) {
            String[] input = line.split(" ");
            String type = input[0];
            String model = input[1];
            String color = input[2];
            int horsepower = Integer.parseInt(input[3]);
            Vehicle vehicle = new Vehicle();
            vehicle.setType(type);
            vehicle.setModel(model);
            vehicle.setColor(color);
            vehicle.setHorsepower(horsepower);
            if (type.equals("car")) {
                cars.add(vehicle);
            } else {
                trucks.add(vehicle);
            }

            line = in.nextLine();
        }

        line = in.nextLine();

        while (!line.equals("Close the Catalogue")) {
            for (Vehicle truck : trucks) {
                if (truck.getModel().equals(line)) {
                    System.out.println(truck.toString());
                }
            }

            for (Vehicle car : cars) {
                if (car.getModel().equals(line)) {
                    System.out.println(car.toString());
                }
            }

            line = in.nextLine();
        }

        double averageCars = 0;
        if (!cars.isEmpty()) {
            for (Vehicle car : cars) {
                averageCars += car.getHorsepower();
            }
            averageCars /= cars.size();
        }
        double averageTrucks = 0;

        if (!trucks.isEmpty()) {
            for (Vehicle truck : trucks) {
                averageTrucks += truck.getHorsepower();
            }
            averageTrucks /= trucks.size();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucks);

    }
}
