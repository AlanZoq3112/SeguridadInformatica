package mx.edu.utez.sda.springmvc8a.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/people").setViewName("people");
        registry.addViewController("/login").setViewName("login");

        registry.addViewController("/accion").setViewName("accion");
        registry.addViewController("/suspenso").setViewName("suspenso");
        registry.addViewController("/eroticas").setViewName("eroticas");
        registry.addViewController("/animal").setViewName("animal");
        registry.addViewController("/anime").setViewName("anime");
        registry.addViewController("/infantil").setViewName("infantil");
    }

}
