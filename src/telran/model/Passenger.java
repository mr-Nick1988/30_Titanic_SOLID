package telran.model;

public class Passenger {
    private final int survived;
    private final int pClass;
    private final String gender;
    private final double age;
    private final double fare;

    public Passenger(int survived, int pcLass, String gender, double age, double fare) {
        this.survived = survived;
        this.pClass = pcLass;
        this.gender = gender;
        this.age = age;
        this.fare = fare;
    }

    public int getSurvived() {
        return survived;
    }

    public int getpClass() {
        return pClass;
    }

    public String getGender() {
        return gender;
    }

    public double getAge() {
        return age;
    }

    public double getFare() {
        return fare;
    }
}
