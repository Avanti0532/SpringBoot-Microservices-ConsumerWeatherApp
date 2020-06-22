package com.avanti.consumerWeatherApp.repository;

import com.avanti.consumerWeatherApp.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather, String> {
}
