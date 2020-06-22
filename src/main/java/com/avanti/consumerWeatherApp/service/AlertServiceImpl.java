package com.avanti.consumerWeatherApp.service;

import com.avanti.consumerWeatherApp.model.WeatherAlert;
import com.avanti.consumerWeatherApp.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlertServiceImpl implements AlertService {

    @Autowired
    private AlertRepository alertRepository;

    @Override
    @Transactional
    public boolean postWeather(WeatherAlert weatherAlert) {
        alertRepository.save(weatherAlert);
        return true;
    }

    @Override
    public List<WeatherAlert> getAllAlerts() {
        return alertRepository.findAll();
    }
}
