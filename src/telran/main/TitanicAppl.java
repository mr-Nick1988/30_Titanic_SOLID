package telran.main;

import telran.dao.CsvReader;
import telran.dao.FareCalculator;
import telran.dao.PassengerAnalyzer;
import telran.model.Passenger;

import java.util.List;

public class TitanicAppl {
    public static void main(String[] args) {
        CsvReader csvReader = new CsvReader();
        List<Passenger> passengers = csvReader.readPassengers();
        PassengerAnalyzer analyzer = new PassengerAnalyzer();
        FareCalculator calculator = new FareCalculator();


        System.out.println("Total Fare: " + calculator.calculateTotalFare(passengers));
        for (int i = 1; i <=3 ; i++) {
            System.out.printf("Average Fare (Class %d): %.2f%n",i,calculator.calculateAverageFareByClass(passengers,i));
        }
        System.out.println("Number of survivors: " + analyzer.countSurvivors(passengers));
        System.out.println("Number of non-survivors: " + analyzer.countNonSurvivors(passengers));
        System.out.println("Number of surviving men: " + analyzer.survivedByGenderSurvival(passengers,"male",true));
        System.out.println("Number of surviving woman: " + analyzer.survivedByGenderSurvival(passengers,"female",true));
        System.out.println("Number of surviving children: " + analyzer.countChildrenBySurvival(passengers,true));
        System.out.println("Number of non-surviving men: " + analyzer.countNonSurvivingMen(passengers));
        System.out.println("Number of non-surviving women: " + analyzer.countNonSurvivingWoman(passengers));
        System.out.println("Number of non-surviving children: " + analyzer.countNonSurvivingChildren(passengers));
    }
}
