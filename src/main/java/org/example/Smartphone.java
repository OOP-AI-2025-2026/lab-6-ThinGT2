package org.example;

interface GPS {
    double[] getCoordinates();
}

interface Cellular {
    void makeCall();
    void receiveCall();
}

public class Smartphone implements GPS, Cellular {

    private final String name;
    private final double latitude;
    private final double longitude;

    public Smartphone(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public double[] getCoordinates() {
        return new double[] { latitude, longitude };
    }

    @Override
    public void makeCall() {
        System.out.println(name + ": Виконується набір номера...");
    }

    @Override
    public void receiveCall() {
        System.out.println(name + ": Вхідний дзвінок. Підключення до абонента.");
    }

    public void showPosition() {
        double[] pos = getCoordinates();
        System.out.printf("%s → Координати: Lat = %.4f, Lon = %.4f%n",
                name, pos[0], pos[1]);
    }
}
