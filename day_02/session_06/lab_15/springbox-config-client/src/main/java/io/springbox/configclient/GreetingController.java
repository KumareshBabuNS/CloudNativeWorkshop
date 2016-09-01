package io.springbox.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by agnisa on 01.09.2016.
 */
@RefreshScope
@RestController
public class GreetingController {

    @Value("${greeting}")
    String greeting;

    @RequestMapping("/")
    public String greeter() {
        return greeting + " World!";
    }

}
