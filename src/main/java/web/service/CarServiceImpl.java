package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private static int CARS_COUNT;
    public List<Car> cars = new ArrayList<>();


    @Override
    public List<Car> getCars(int count) {
        cars.add(new Car("White","model1", ++CARS_COUNT));
        cars.add(new Car("Black","model2", ++CARS_COUNT));
        cars.add(new Car("Yellow","model3", ++CARS_COUNT));
        cars.add(new Car("Red","model4", ++CARS_COUNT));
        cars.add(new Car("Green","model5",++CARS_COUNT));

        return cars.subList(0,count);
    }
}
