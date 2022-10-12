package web.models.dao;

import org.springframework.stereotype.Repository;
import web.models.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    private final List<Car> cars;
    {
     cars = new ArrayList<>();
     cars.add(new Car(0, "c0", 0));
     cars.add(new Car(1, "c1", 1));
     cars.add(new Car(2, "c2", 2));
     cars.add(new Car(3, "c3", 3));
     cars.add(new Car(4, "c4", 4));
    };



    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
