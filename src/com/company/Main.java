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
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws SQLException {
        Connector.connect();
        Human pierwszy = new Human("Marek", "Nowak");
        Animal anim = new Animal("cat", "romek", 12.0);
//
//        anim.save();
//        pierwszy.saveHuman();
        List<Animal> animals =  anim.downloadAnimal();
//        System.out.println(animals);
        for (int i = 0; i< animals.size(); i++){
            System.out.println(animals.get(i));
        }
//        pierwszy.downloadHuman();


//        ZADANIE Z INSTALOWANIEM APLIKACJI
//        pierwszy.setCash(5000.0);
//        Phone nokia = new Phone(1900,"nokia","3510",7.0);
//        Application app1 = new Application("ZGoogleMap", 1.0,100.0);
//        Application app2 = new Application("OGoogleStore", 2.0,400.0);
//        Application app3 = new Application("XGmail", 4.1,0.0);
//        Application app4 = new Application("BOutlook", 3.0,0.0);
//
//        System.out.println(pierwszy.firstName + " "+pierwszy.lastName + " posiada pieniędzy: " + pierwszy.getCash());
//        pierwszy.phone = nokia;
//        nokia.installApp(pierwszy,app1);
//        nokia.installApp(pierwszy,app2);
//        nokia.installApp(pierwszy,app3);
//        nokia.installApp(pierwszy,app4);
//        System.out.println(pierwszy.firstName + " "+pierwszy.lastName + " posiada pieniędzy: " + pierwszy.getCash());
//        System.out.println(nokia.deviceApplication);
//        System.out.println("czy jest aplikacja GoogleMap -> " + nokia.hasApp(app1));
//        System.out.println(" czy posiada aplikacje po nazwie -> " + nokia.hasNameApp("GoogleMap"));
////        System.out.println("cena aplikacji to: " + nokia.appValue());
//
//        System.out.println();
//        System.out.print("cena aplikacji to: ");
//        nokia.appekValue();
//        System.out.println();
//        System.out.print("aplikacje darmowe:");
//        nokia.freeAplication();
//        nokia.sortedByAlphabet();
    }

}




