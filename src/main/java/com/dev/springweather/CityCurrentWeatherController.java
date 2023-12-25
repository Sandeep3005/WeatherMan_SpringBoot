package com.dev.springweather;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dev.springweather.Beans.Activity;
import com.dev.springweather.Beans.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CityCurrentWeatherController {
    @GetMapping("/hello")
    public String getCurrentWeather() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", "renault");
        return objectMapper.writeValueAsString(car);
    }

    @GetMapping("/getActivity")
    public String getActivity() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String uri = "https://www.boredapi.com/api/activity";
        RestTemplate restTemplate = new RestTemplate();
        Activity activity = restTemplate.getForObject(uri, Activity.class);
        System.out.println("User: " + activity);
        return objectMapper.writeValueAsString(activity);
    }
    

}
