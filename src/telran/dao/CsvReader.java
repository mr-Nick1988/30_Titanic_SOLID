package telran.dao;

import telran.model.Passenger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader {
    public List<Passenger> readPassengers() {
        List<Passenger> passengers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Titanic.csv"))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] cell = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if (cell.length < 12) {
                    continue;
                }
                int survived = Integer.parseInt(cell[1]);
                int pClass = Integer.parseInt(cell[2]);
                String gender = cell[4];
                double age = cell[5].isEmpty() ? -1 : Double.parseDouble(cell[5]);
                double fare = cell[9].isEmpty() ? 0 : Double.parseDouble(cell[9]);
                // System.out.println(Arrays.toString(cell));
                passengers.add(new Passenger(survived, pClass, gender, age, fare));

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return passengers;
    }
}