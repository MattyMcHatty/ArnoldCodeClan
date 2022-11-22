package vehicles;

import behaviours.ICost;
import components.Chassis;
import components.Engine;
import components.Tyres;

public abstract class Vehicle implements ICost {

    private Chassis chassis;
    private Engine engine;
    private Tyres tyres;
    private String colour;
    private String name;
    private double damage;

    public Vehicle(Chassis chassis, Engine engine, Tyres tyres, String colour, String name){
        this.chassis = chassis;
        this.engine = engine;
        this.tyres = tyres;
        this.colour = colour;
        this.name = name;
        this.damage = 0;

    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
