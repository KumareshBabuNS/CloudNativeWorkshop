package io.spring.pivotal.sensor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by agnisa on 01.09.2016.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SensorData {

    private int sensorId;

    private double temperature;
}
