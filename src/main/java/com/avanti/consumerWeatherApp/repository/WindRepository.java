package com.avanti.consumerWeatherApp.repository;

import com.avanti.consumerWeatherApp.model.Wind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WindRepository extends JpaRepository<Wind, String> {
}
