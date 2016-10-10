package com.pearson.tutorials;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Spring Boot application entry point.
 *
 * @author Danushka Jayamaha
 */
@SpringBootApplication
@EnableSwagger2
public class Application {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Comment API.
     *
     * @return the notes Docket
     */
    @Bean
    public Docket commentApi() {
        return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(false).apiInfo(apiInfo()).select()
                .paths(notePaths()).build();
    }

    /**
     * Note paths.
     *
     * @return the predicate
     */
    private Predicate<String> notePaths() {
        return or(regex("/notes.*"), regex("/health"));
    }

    /**
     * API info.
     *
     * @return the API info
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Notes Demo API").description("Demo application for note handling.")
                .version("2.0").build();
    }
}