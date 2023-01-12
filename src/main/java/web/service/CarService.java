package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mitsu", "MonteroSport", "green"));
        cars.add(new Car("BMW", "320", "red"));
        cars.add(new Car("LADA", "Priora", "black"));
        cars.add(new Car("Mazda", "Cronos", "blue"));
        cars.add(new Car("Mitsu", "Galant", "red"));
        cars.add(new Car("Mitsu", "Galant", "green"));
        cars.add(new Car("Lada", "2106", "green"));
        return cars;
    }

    public List<Car> showCars(Integer count) {
//        Предназначен для отображения всех машин, в случае если count = null
        if (count == null) {
            count = getCars().size();
        }
        int getCount = count < getCars().size() ? count : getCars().size();
        return getCars().subList(0, getCount);
    }
}
