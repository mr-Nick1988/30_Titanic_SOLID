package telran.dao;

import telran.model.Passenger;

import java.util.List;

public class PassengerAnalyzer {
    public int countSurvivors(List<Passenger> passengers) {
        return (int) passengers.stream().filter(p -> p.getSurvived() == 1).count();
    }

    public int countNonSurvivors(List<Passenger> passengers) {
        return (int) passengers.stream().filter(p -> p.getSurvived() == 0).count();
    }

    public int survivedByGenderSurvival(List<Passenger> passengers, String gender, boolean survived) {
        return (int) passengers.stream().filter(p -> p.getGender().equals(gender) && p.getSurvived() == (survived ? 1 : 0)).count();
    }

    public int countChildrenBySurvival(List<Passenger> passengers, boolean survived) {
        return (int) passengers.stream().filter(p -> p.getAge() >= 0 && p.getAge() < 18 && p.getSurvived() == (survived ? 1 : 0)).count();
    }

    public int countNonSurvivingMen(List<Passenger> passengers) {
        return (int) passengers.stream()
                .filter(p -> p.getGender().equalsIgnoreCase("male") && p.getSurvived() == 0)
                .count();

    }

    public int countNonSurvivingWoman(List<Passenger> passengers) {
        return (int) passengers.stream()
                .filter(p -> p.getGender().equalsIgnoreCase("female") && p.getSurvived() == 0)
                .count();
    }
    public int countNonSurvivingChildren(List<Passenger>passengers){
        return (int) passengers.stream()
                .filter(p->p.getAge()>=0&&p.getAge()<18&&p.getSurvived()==0)
                .count();
    }
}
