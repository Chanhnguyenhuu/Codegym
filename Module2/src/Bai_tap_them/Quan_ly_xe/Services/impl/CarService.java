package Bai_tap_them.Quan_ly_xe.Services.impl;

import Bai_tap_them.Quan_ly_xe.Models.impl.Car;
import Bai_tap_them.Quan_ly_xe.Repository.CarRepository;
import Bai_tap_them.Quan_ly_xe.Services.IsCarService;

public class CarService implements IsCarService {

    CarRepository carRepository = new CarRepository();

    @Override
    public void add(Car car) {
        carRepository.addCar(car);
    }

    @Override
    public void view() {
        carRepository.view();
    }
}
