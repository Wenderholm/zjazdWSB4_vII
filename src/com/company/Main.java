package com.company;

import com.company.Connector.Connector;
import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws SQLException {
        Connector.connect();
        Human pierwszy = new Human ("Marek","Nowak");
//        Human drugi = new Human ("Jarek", "BBBB");
//        Human trzeci = new Human ("Janek", "CCC");
//        pierwszy.saveHuman();
//
//        Car toyota = new Car(1990,"Toyota","avensis","red",200.0);
//
//        pierwszy.setCar(toyota,1);
//        pierwszy.setCash(4000.0);
//        drugi.setCash(900.0);
//        trzeci.setCash(3000.0);
//
//        System.out.println("Liczba transakcji: " + toyota.numberOfTransactions());
//        try {
//            toyota.sell(pierwszy, drugi, 200.0);
//        } catch (Exception e) {
//            e.printStackTrace();
        Animal anim = new Animal("cat","romek",12.0);
//        anim.save();
        anim.downloadAnimal();
        pierwszy.downloadHuman();

    }
//        try {
//            toyota.sell(drugi, pierwszy, 200.0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(toyota.owners);
//        System.out.println("Liczba transakcji: " + toyota.numberOfTransactions());
//        System.out.println(toyota.wasAnOwner(pierwszy));
//        System.out.println(toyota.aSoldToB(pierwszy,drugi));

//        Phone nokia = new Phone( 1990,"nokia","stara", 5.0);
//        nokia.installApp(pierwszy, "nowa");

}
