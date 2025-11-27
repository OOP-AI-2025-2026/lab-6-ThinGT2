package org.example;

class Car implements Comparable {

    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


    @Override
    public int compareTo(Object obj) {
        if (!(obj instanceof Car)) {
            throw new ClassCastException("Порівнювати можна лише з об’єктами типу Car.");
        }

        Car otherCar = (Car) obj;

        if (this.price != otherCar.price) {
            return otherCar.price - this.price;
        }

        if (this.year != otherCar.year) {
            return this.year - otherCar.year;
        }

        return this.horsePower - otherCar.horsePower;
    }

    @Override
    public String toString() {
        return "Car [Price=" + price + 
          ", Year=" + year + 
          ", HP=" + horsePower + 
          "]";
    }
}
