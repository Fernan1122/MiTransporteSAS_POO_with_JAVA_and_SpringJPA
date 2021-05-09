package com.unad.poo;

import com.unad.poo.views.AppLogin;
import com.unad.poo.views.EmpleadoFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.unad.poo")
public class ProgramaJavaApplication {

    public static void main(String[] args) {
        AppLogin login = new AppLogin();
        login.setVisible(true);
    }

    public static void runSpringServer(String[] args) {
        /*
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                    .headless(false).run(args);
         */
        SpringApplication.run(ProgramaJavaApplication.class, args);
    }

}
