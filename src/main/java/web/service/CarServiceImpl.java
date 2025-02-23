package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private static int CARS_COUNT;
    public List<Car> cars = Arrays.asList(new Car("White", "model1", ++CARS_COUNT)
            , new Car("Black", "model2", ++CARS_COUNT)
            , new Car("Yellow", "model3", ++CARS_COUNT)
            , new Car("Red", "model4", ++CARS_COUNT)
            , new Car("Green", "model5", ++CARS_COUNT));

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
