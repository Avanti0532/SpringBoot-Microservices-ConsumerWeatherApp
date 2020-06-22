package com.avanti.consumerWeatherApp.controller;

import com.avanti.consumerWeatherApp.model.WeatherAlert;
import com.avanti.consumerWeatherApp.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherAlertController {

    @Autowired
    private AlertService alertService;

    @PostMapping("addReading")
    public boolean postWeather(@RequestBody WeatherAlert weatherAlert){
        return alertService.postWeather(weatherAlert);
    }

    @GetMapping("getAlerts")
    public List<WeatherAlert> getWeatherAlert(){
        return alertService.getAllAlerts();
    }
}
