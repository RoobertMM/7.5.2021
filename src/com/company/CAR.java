package com.company;

public class CAR {
    private String logo;
    private int horsePower;
    private int doors;
    private double km;

    public CAR(String logo, int horsePower, int doors, double km){
        this.logo=logo;
        this.horsePower=horsePower;
        this.doors=doors;
        this.km=km;
    }

    public void setLogo(String logo) { this.logo = logo; }

    public String getLogo() { return logo; }

    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    public int getHorsePower() { return horsePower; }

    public void setDoors(int doors) { this.doors = doors; }

    public int getDoors() { return doors;}

    public void setKm(double km) { this.km = km; }

    public double getKm() { return km; }

    @Override
    public String toString() {
        return "This new "+ getLogo() + " has " + getHorsePower() + " horse power." +
                "\nShe has " + getDoors() + " doors "+ "with only "+ getKm() + " Km on board!";
    }
}
