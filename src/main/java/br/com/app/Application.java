package br.com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring Boot Application class
 */
@SpringBootApplication(scanBasePackages = "${app.base-package}")
@EnableFeignClients // @TODO conditional dependencies
@EnableTransactionManagement
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
