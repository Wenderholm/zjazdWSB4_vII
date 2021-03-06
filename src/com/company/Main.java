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
import java.util.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connector.connect();
        Human pierwszy = new Human("Marek", "Nowak");
        Animal anim = new Animal("cat", "romek", 12.0);

        anim.save();
        pierwszy.saveHuman();
        List<Animal> animals =  anim.downloadAnimal();
//        System.out.println(animals);
        for (int i = 0; i< animals.size(); i++){
            System.out.println(animals.get(i));
        }
        pierwszy.downloadHuman();


//        ZADANIE Z INSTALOWANIEM APLIKACJI
//        pierwszy.setCash(5000.0);
//        Phone nokia = new Phone(1900,"nokia","3510",7.0);
//        Application app1 = new Application("GoogleMap", 1.0,100.0);
//        Application app2 = new Application("GoogleStore", 2.0,400.0);
//        Application app3 = new Application("Gmail", 4.1,0.0);
//        Application app4 = new Application("Outlook", 3.0,0.0);
//        Application app5 = new Application("AutoMapa", 3.1,0.0);
//        Application app6 = new Application("PlayFilm", 3.3,700.0);
//
//        System.out.println(pierwszy.firstName + " "+pierwszy.lastName + " posiada pieniędzy: " + pierwszy.getCash());
//        pierwszy.phone = nokia;
//        nokia.installApp(pierwszy,app1);
//        nokia.installApp(pierwszy,app2);
//        nokia.installApp(pierwszy,app3);
//        nokia.installApp(pierwszy,app4);
//        nokia.installApp(pierwszy,app5);
//        nokia.installApp(pierwszy,app6);
//        System.out.println(pierwszy.firstName + " "+pierwszy.lastName + " posiada pieniędzy: " + pierwszy.getCash());
//        System.out.println(nokia.deviceApplication);
//        System.out.println("czy jest aplikacja GoogleMap -> " + nokia.hasApp(app1));
//        System.out.println(" czy posiada aplikacje po nazwie -> " + nokia.hasNameApp("GoogleMap"));
//        System.out.println("cena aplikacji to: " + nokia.appValue());

//        System.out.println();
//        System.out.print("cena aplikacji to: ");
//        nokia.appekValue();
//        System.out.println();
//        nokia.freeAplication();
//        nokia.sortedByAlphabet();
//        nokia.sortedByPrice();
//        System.out.println(nokia.devApp.get("ZGoogleMap"));

//       ZADANIE
//        1. Create a HashMap with String model as key and Car as value
//        2. Add a few cars into a map.
//        3. Print it in alphabetical order of models.
        Map<String, Car> automobil = new HashMap<>();
        automobil.put("wyscigowy", new Car(1990,"toyota","avensis","red",1000.0));
        automobil.put("rajdowy", new Car(2000,"toyota","corolla","black",1000.0));
        automobil.put("klasyczny", new Car(1890,"toyota","classic","green",100000.0));

//        for(Car cars : automobil.values()){
//            System.out.println(cars);
//        }

        System.out.println("---------posortowane przez TreeMap-----");
        Map<String, Car> automobilSorted = new TreeMap<>(automobil);
        for(Car cars2 : automobilSorted.values()){
            System.out.println(cars2);
        }
//        System.out.println(automobilSorted(1));

        Map<String, Double> countries = new HashMap<>();
        countries.put("Poland", 36_000_000.0);
        countries.put("Italy", 56_000_000.0);
        countries.put("Germany", 41_000_000.0);
        countries.put("France", 26_000_000.0);
        countries.put("England", 66_000_000.0);

//      posortowanie tablicy po wartosciach
        List<Double> sortedCountries = new ArrayList<>(countries.values());
        Collections.sort(sortedCountries);
//        wypisanie z map najwieksze i najmniejszy kraj
        Set<Map.Entry<String,Double>> entrySet = countries.entrySet();
        for(Map.Entry<String,Double> entry: entrySet) {
            Double numMin = sortedCountries.get(0);
            Double numMax = sortedCountries.get(sortedCountries.size()-1);
            if (numMin == entry.getValue()){
                System.out.println("najmniejszy kraj to "+entry.getKey()+ " a liczba ludnosci to "+ entry.getValue());
            };
            if (numMax == entry.getValue()){
                System.out.println("największy kraj to "+entry.getKey()+ " a liczba ludnosci to "+ entry.getValue() );
            };
        }
//
//        System.out.println("-----------posortowane przez ArrayList------");
//        List<String> automobilSorted2 = new ArrayList<>(automobil.keySet());
//        Collections.sort(automobilSorted2);
//        System.out.println("posortowane " + automobilSorted2);
//        for (int i = 0; i < automobil.size(); i++){
//            System.out.println(automobil.get(automobilSorted2.get(i)));
//        }

    }

}




