package web.models.dao;

import web.models.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars(int count);
}
