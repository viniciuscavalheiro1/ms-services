package br.com.vinicius.controller;

import br.com.vinicius.configuration.GreetingConfiguration;
import br.com.vinicius.model.Gretting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingConfiguration configuration;

    @RequestMapping("/greeting")
    public Gretting  greeting(
            @RequestParam(value="name",
            defaultValue = "") String name) {

        if (name.isEmpty()) name = configuration.getDefaultValue();

        return new Gretting(
                counter.incrementAndGet(),
                String.format(template, configuration.getGreeting(), name)
        );
    }
}
