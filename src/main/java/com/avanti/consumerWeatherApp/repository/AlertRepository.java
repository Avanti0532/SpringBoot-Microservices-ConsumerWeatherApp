package com.avanti.consumerWeatherApp.repository;
import com.avanti.consumerWeatherApp.model.WeatherAlert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<WeatherAlert, String> {
}
