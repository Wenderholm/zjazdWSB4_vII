package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Human pierwszy = new Human ("Pierwszy", "Kupujący");
        Human drugi = new Human ("Drugi", "Kupujący");

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dane samochodu 1 - rok produkcji:");
        String rok = scan.nextLine();
        System.out.println("Podaj dane samochodu 1 - producent:");
        String producent = scan.nextLine();
        System.out.println("Podaj dane samochodu 1 - model:");
        String model = scan.nextLine();
        System.out.println("Podaj dane samochodu 1 - kolor:");
        String color = scan.nextLine();
        System.out.println("Podaj dane samochodu 1 - wartość:");
        String value = scan.nextLine();
        Car car1 = new Car(Integer.parseInt(rok), producent, model, color, Double.parseDouble(value));

        System.out.println("Podaj dane samochodu 2 - rok produkcji:");
        rok = scan.nextLine();
        System.out.println("Podaj dane samochodu 2 - producent:");
        producent = scan.nextLine();
        System.out.println("Podaj dane samochodu 2 - model:");
        model = scan.nextLine();
        System.out.println("Podaj dane samochodu 2 - kolor:");
        color = scan.nextLine();
        System.out.println("Podaj dane samochodu 2 - wartość:");
        value = scan.nextLine();

        Car car2 = new Car(Integer.parseInt(rok), producent, model, color, Double.parseDouble(value));
        pierwszy.addCar(car1);
        pierwszy.addCar(car2);
        drugi.setCash(900.0);
        try {
            car1.sell(pierwszy, drugi, 200.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            car2.sell(pierwszy, drugi, 300.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
