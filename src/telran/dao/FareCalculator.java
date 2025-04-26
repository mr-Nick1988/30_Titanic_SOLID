package telran.dao;

import telran.model.Passenger;

import java.util.List;

public class FareCalculator {
    public double calculateTotalFare(List<Passenger> passengers) {
        return passengers.stream().mapToDouble(Passenger::getFare).sum();
    }

    public double calculateAverageFareByClass(List<Passenger> passengers, int pClass) {
        return passengers.stream()
                .filter(p -> p.getpClass() == pClass)
                .mapToDouble(Passenger::getFare)
                .average()
                .orElse(0);
    }
}
