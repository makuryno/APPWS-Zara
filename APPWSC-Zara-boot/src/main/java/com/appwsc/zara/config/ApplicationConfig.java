package com.appwsc.zara.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@ComponentScan({"com.appwsc.zara.ws.controller", "com.appwsc.zara.api.service"})
@EnableJpaRepositories("com.appwsc.zara.model.repository")
@EnableSwagger2
public class ApplicationConfig {


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(
                        RequestHandlerSelectors
                                .basePackage("com.appwsc.zara.ws.controller"))
                .paths(PathSelectors.any())
                .build();
    }

}
