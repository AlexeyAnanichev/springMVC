package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    List<Car> list = new ArrayList<>();

    public List<Car> getList() {
        list.add(new Car("Mercedes-Benz", 124, "Hardtop"));
        list.add(new Car("BMW", 7, "Sedan"));
        list.add(new Car("Saab", 98, "Sedan"));
        list.add(new Car("Jaguar ", 120, "Roadster"));
        list.add(new Car("Porsche", 356, "Fastback"));
        return list;
    }


    public List<Car> getCars(Integer number) {
        if (number < 5) {
            return getList().subList(0, number);
        }
        return getList();
    }
}
