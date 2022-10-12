package web.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.models.dao.CarDao;
import web.models.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    private final CarDao cars;

    @Autowired
    public CarServiceImpl(CarDao cars) {
        this.cars = cars;
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.getCars(count);
    }
}
