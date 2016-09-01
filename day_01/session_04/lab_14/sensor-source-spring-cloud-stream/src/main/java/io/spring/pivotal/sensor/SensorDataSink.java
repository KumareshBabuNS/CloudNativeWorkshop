package io.spring.pivotal.sensor;

import lombok.extern.slf4j.Slf4j;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * Created by agnisa on 01.09.2016.
 */
@EnableBinding(Sink.class)
@Slf4j
public class SensorDataSink {

    @ServiceActivator(inputChannel = Sink.INPUT)
    public void ingest(Object payload) {
        log.info("Received: " + payload);
    }
    
}
