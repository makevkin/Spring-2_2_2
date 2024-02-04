package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component("carService")
public class CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> listCars() {
        cars.add(new Car("audi", 2010, 3000));
        cars.add(new Car("Niva", 2000, 1000));
        cars.add(new Car("bmw",2020, 5000));
        cars.add(new Car("kia", 2018, 3500));
        cars.add(new Car("toyota", 2015, 3200));
        return cars;
    }
    public List<Car> getCountCar(int count) {
        if (count <5) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
