package org.facedamon.door;

import lombok.extern.slf4j.Slf4j;
import org.facedamon.door.config.StarterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class DemoSpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoSpringbootApplication.class, args);
        StarterService starterService = context.getBean(StarterService.class);
        DoJoinPoint joinPoint = context.getBean(DoJoinPoint.class);
        log.info("startService: {}, joinPoint: {}", starterService, joinPoint);
    }

}
