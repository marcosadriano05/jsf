package com.learning.jsf;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CarView implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private CarRepository carRepository;

    private List<Car> cars;

    @PostConstruct
    public void init() {
        cars = carRepository.findAll();
    }

    public List<Car> getCars() {
        return cars;
    }
}
