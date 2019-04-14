package com.ihnsod.vitality.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: Ihnsod
 * @create: 2019/04/06 18:44
 **/
@Configuration
@EnableSwagger2
@Profile({"dev","test"})
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ihnsod.vitality.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Vitality~~")
                .description("嘿.嘿嘿嘿... 嘻.嘻嘻嘻...")
                .termsOfServiceUrl("https://github.com/Ihnsod/vitality")
                .contact("Ihnsod~~")
                .version("1.0")
                .build();
    }

}
