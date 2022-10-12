package web.models.service;

import web.models.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(int count);
}
