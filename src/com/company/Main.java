package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Human pierwszy = new Human ("Marek", "AAAA");
        Human drugi = new Human ("Jarek", "BBBB");
        Human trzeci = new Human ("Janek", "CCC");

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj dane samochodu 1 - rok produkcji:");
//        String rok = scan.nextLine();
//        System.out.println("Podaj dane samochodu 1 - producent:");
//        String producent = scan.nextLine();
//        System.out.println("Podaj dane samochodu 1 - model:");
//        String model = scan.nextLine();
//        System.out.println("Podaj dane samochodu 1 - kolor:");
//        String color = scan.nextLine();
//        System.out.println("Podaj dane samochodu 1 - wartość:");
//        String value = scan.nextLine();
//        Car car1 = new Car(Integer.parseInt(rok), producent, model, color, Double.parseDouble(value));
//
//        System.out.println("Podaj dane samochodu 2 - rok produkcji:");
//        rok = scan.nextLine();
//        System.out.println("Podaj dane samochodu 2 - producent:");
//        producent = scan.nextLine();
//        System.out.println("Podaj dane samochodu 2 - model:");
//        model = scan.nextLine();
//        System.out.println("Podaj dane samochodu 2 - kolor:");
//        color = scan.nextLine();
//        System.out.println("Podaj dane samochodu 2 - wartość:");
//        value = scan.nextLine();

//        Car car2 = new Car(Integer.parseInt(rok), producent, model, color, Double.parseDouble(value));
        Car toyota = new Car(1990,"Toyota","avensis","red",200.0);

        pierwszy.setCar(toyota,1);
//        pierwszy.addCar(car2);
        pierwszy.setCash(4000.0);
        drugi.setCash(900.0);
        trzeci.setCash(3000.0);

        System.out.println("Liczba transakcji: " + toyota.numberOfTransactions());
        try {
            toyota.sell(pierwszy, drugi, 200.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        try {
//            toyota.sell(drugi, pierwszy, 200.0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            toyota.sell(pierwszy, drugi, 200.0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            toyota.sell(drugi, pierwszy, 200.0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            toyota.sell(pierwszy, drugi, 200.0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            toyota.sell(drugi, trzeci, 200.0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            car2.sell(pierwszy, drugi, 300.0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println(toyota.owners);
        System.out.println("Liczba transakcji: " + toyota.numberOfTransactions());
        System.out.println(toyota.wasAnOwner(pierwszy));
        System.out.println(toyota.aSoldToB(pierwszy,drugi));
    }
}
