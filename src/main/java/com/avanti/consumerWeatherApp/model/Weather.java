package com.avanti.consumerWeatherApp.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@Entity
public class Weather {
    @Id
    private String id;
    private String city;
    private String description;
    private double humidity;
    private double temperature;
    private double pressure;
    private Timestamp timestamp;
    @OneToOne(cascade = CascadeType.ALL)
    private Wind wind;

    public Weather(){
        this.id = UUID.randomUUID().toString();
    }

}
