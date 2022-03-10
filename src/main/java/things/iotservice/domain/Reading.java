package things.iotservice.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Reading {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double temperature;
    private double humidity;

    public Reading() {
    }

    public Reading(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }
}
