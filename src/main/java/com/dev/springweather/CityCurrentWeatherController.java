package com.dev.springweather;

import org.springframework.web.bind.annotation.RestController;

import com.dev.springweather.Beans.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CityCurrentWeatherController {
    @GetMapping("/hello")
    public String getCurrentWeather() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", "renault");
        return objectMapper.writeValueAsString(car);
    }

}
