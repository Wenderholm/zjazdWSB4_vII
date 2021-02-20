package com.company.creatures;

import com.company.Connector.Connector;
import com.company.devices.Saleable;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Animal implements Saleable, Feedable {

    final static Double MIN_WEIGHT = 2.0;
    final static Double DEFAULT_FOOD_WEIGHT = 1.0;

    final public String species;
    public Boolean isAlive = true;
    public String name;
    File pic;
    private Double weight = 10.0;

    public Animal(String species) {
        this.species = species;
    }

    public Animal(String species, String name, Double weight) {
        this.species = species;
        this.name = name;
        this.weight = weight;
    }

    public void feed() {
        if (this.species == "dog") {
            feed(2.0);
        } else if (this.species == "cat") {
            feed(0.5);
        } else if (this instanceof FarmAnimal) {
            feed(5.0);
        } else {
            feed(DEFAULT_FOOD_WEIGHT);
        }
    }

    public void feed(double foodWeight) {
        if (this.isAlive) {
            this.weight += foodWeight;
            System.out.println("thx for food");
        } else {
            System.out.println("too late");
        }
    }


    public void takeForAWalk() {
        if (this.isAlive) {
            this.weight--;
            System.out.println("thx for a walk, bro");
            if (this.weight < MIN_WEIGHT) {
                this.isAlive = false;
            }
        } else {
            System.out.println("go for jail");
            System.out.println("nice");
        }
    }

    public Double getWeight() {
        return weight;
    }

    void setWeight(Double newWeight) {
        this.weight = newWeight;
    }

    public String toString() {
        return this.species + " " + this.name + " isAlive: " + this.isAlive;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }

    public void save() throws SQLException{
        String sql = "insert into animals values ('" + this.species + "' , '" + this.name + "' , " + this.weight + ");";
//        String sql = "insert into animals (species, name, weight) values ('cat', 'puszek', 16)";
        System.out.println(sql);
        Connector.executSQL(sql);
    }

    public void downloadAnimal() throws SQLException{
        ResultSet rs = Connector.getStatement().executeQuery("SELECT * FROM ANIMALS;");
        System.out.println("lista zwierzat znajdujacych się w bazie danych");
        while(rs.next()){
            String species = rs.getString("species");
            String name = rs.getString("name");
            int weight = rs.getInt("weight");
            System.out.println("species: " + species);
            System.out.println("name: " + name);
            System.out.println("weight: " + weight);
            System.out.println();
        }
        rs.close();
    }
}
