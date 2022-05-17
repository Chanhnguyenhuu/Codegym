package Bai_tap_them.Quan_ly_xe.Controllers;

import Bai_tap_them.Quan_ly_xe.Models.impl.Car;
import Bai_tap_them.Quan_ly_xe.Services.impl.CarService;

public class CarController {
    private static final CarService carService = new CarService();
    public void addCar(Car car) {
        carService.add(car);
    }

    public void view() {
        carService.view();
    }
}
