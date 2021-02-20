package com.company;

import com.company.Connector.Connector;
import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Application;
import com.company.devices.Car;
import com.company.devices.Phone;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws SQLException {
        Connector.connect();
        Human pierwszy = new Human("Marek", "Nowak");
        Animal anim = new Animal("cat", "romek", 12.0);
//
//        anim.save();
//        pierwszy.saveHuman();
        anim.downloadAnimal();
        pierwszy.downloadHuman();
//        ZADANIE Z INSTALOWANIEM APLIKACJI
//        pierwszy.setCash(5000.0);
//        Phone nokia = new Phone(1900,"nokia","3510",7.0);
//        Application app1 = new Application("GoogleMap", 1.0,100.0);
//        Application app2 = new Application("GoogleStore", 2.0,400.0);
//        System.out.println(pierwszy.firstName + " "+pierwszy.lastName + " posiada pieniędzy: " + pierwszy.getCash());
//        pierwszy.phone = nokia;
//        nokia.installApp(pierwszy,app1);
//        nokia.installApp(pierwszy,app2);
//        System.out.println(pierwszy.firstName + " "+pierwszy.lastName + " posiada pieniędzy: " + pierwszy.getCash());
//        System.out.println(nokia.deviceApplication);


        //        nokia.installApp(pierwszy,);
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

    }
//


