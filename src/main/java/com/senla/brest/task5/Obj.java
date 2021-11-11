package com.senla.brest.task5;
//класс предмета
public class Obj {

    private int numberOfObject;
    private int volume;
    private int price;

    public Obj(int numberOfObject, int volume, int price) {
        this.numberOfObject = numberOfObject;
        this.volume = volume;
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Obj{" + "numberOfObject='" + numberOfObject + '\'' +
                ", volume=" + volume + ", price=" + price + '}';
    }
}
