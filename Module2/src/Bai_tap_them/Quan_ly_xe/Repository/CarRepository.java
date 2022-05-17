package Bai_tap_them.Quan_ly_xe.Repository;

import Bai_tap_them.Quan_ly_xe.Models.impl.Car;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CarRepository {

    private static final ArrayList arrayList = new ArrayList<Car>();


    public void addCar(Car car) {
        try {
            FileWriter fileWriter = new FileWriter("src/Bai_tap_them/Quan_ly_xe/Data/Car");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(car.toString());
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        arrayList.add(car);
    }

    public void view() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
