package com.company.devices;

import com.company.creatures.Human;

import java.net.URL;
import java.util.*;

public class Phone extends Device implements Saleable {
    public final Double screenSize;
    public Map<String, Double> devApp = new HashMap<>();
    public List<String> deviceApplication = new ArrayList<>();
    public static final String DEFAULT_APP_VERSION = "LATEST";
    public static final String DEFAULT_SERVER_ADDRESS = "appserver.me.com";

    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize) {
        super(yearOfProduction, producer, model);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("you pushed the button");
        System.out.println("black screen");
        System.out.println("black screen");
        System.out.println("black screen");
        System.out.println("beeep");
        System.out.println("helou");
        System.out.println("producer logo");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getCash() == null || buyer.getCash() == null) {
            throw new Exception("Musisz zdefiniować stan portfela ");
        }
        if (seller.phone == null) {
            System.out.println("Sorry nie masz telefonu");
            throw new Exception("Brak telefonu");
        }
        if (buyer.getCash() < price) {
            System.out.println("Sorry, nie masz kasy");
            throw new Exception("Brak pieniędzy");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        buyer.phone = seller.phone;
        seller.phone = null;
        System.out.println("telefon sprzedano za " + price + " od " + seller.firstName + " do " + buyer.firstName);
    }

    public boolean installAnApp(List<String> appNames) {
        System.out.println("ale głupie te zadania");
        return true;
    }

    public boolean installAnApp(String appName) {
        return installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public boolean installAnApp(String appName, String version) {
        return installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }

    public boolean installAnApp(String appName, String version, String server) {
        //weryfikacja wieku użytkownika
        //sprawdzenie czy mamy dość miejsca na telefonie
        //sprawdzenie czy płatne
        //przekierowanie do płatności
        //wykonanie płatności
        //weryfikacja płatności
        //pobranie aplikacji
        //skanowanie aplikacji/sprawdzenie sumy kontrolnej
        //rozpakowanie pliku z aplikacją
        //instalacja
        System.out.println("Zainstalowano " + appName + " w wersji " + version + " z serwera " + server);
        return true;
    }

    public boolean installAnApp(URL url) {
        System.out.println();
        return true;
    }
    public void installApp(Human human, Application app){
        if(human.getCash() > app.appCost){

            devApp.put(app.appName,app.appCost);
            deviceApplication.add(app.appName);
            human.setCash(human.getCash()-app.appCost);

        }
    }


    public boolean hasApp(Application app){
        boolean hasThisApp = false;
        for(int i=0; i < this.deviceApplication.size(); i++){
            if(this.deviceApplication.get(i) == app.appName){
                hasThisApp = true;
                break;
            }
        }
        return hasThisApp;
    }
    public boolean hasNameApp(String appName){
        boolean hasThisApp = false;
        for(int i=0; i < this.deviceApplication.size(); i++){
            if(this.deviceApplication.get(i) == appName){
                hasThisApp = true;
                break;
            }
        }
        return hasThisApp;
    }
    public void appekValue(){
//      I sposób iteracji po map
//        for (Map.Entry<String, Double> pair : devApp.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }
//
//        II sposób iteracji po map
//        devApp.forEach((k, v) -> System.out.println(k + " " + v));
//
//        III sposób iteraci po map
//        for(String key : devApp.keySet()) {
//            String value = devApp.get(key);
//            System.out.println(key + ": " + value);
//        }
        Double sum = 0.0;
        for(String key : devApp.keySet()) {
            Double value = devApp.get(key);
            sum += value;
        }
        System.out.println(sum);
    }


    public void freeAplication(){
          for(String key : devApp.keySet()) {
            Double value = devApp.get(key);
            if (value == 0){
                System.out.print(key + ", ");
            }
        }
    }

    public void sortedByAlphabet(){

    }

}
