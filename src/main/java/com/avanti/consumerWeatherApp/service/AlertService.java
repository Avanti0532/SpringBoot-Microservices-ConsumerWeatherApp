package com.avanti.consumerWeatherApp.service;

import com.avanti.consumerWeatherApp.model.WeatherAlert;

import java.util.List;

public interface AlertService {
    boolean postWeather(WeatherAlert weatherAlert);
    List<WeatherAlert> getAllAlerts();
}
