package edu.moduloalumno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.swagger.web.OperationsSorter;

@Configuration

public class SwaggerConfig {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Modulo Alumno REST API")
            .description("Documentacion del Backend del modulo de Consulta Alumno")
            .contact(new Contact("SIGAP VIDCO 2020", "https://github.com/marcomania/sigapcovid-consultarecibos-back", "marcow85m@gmail.com"))
            .license("Apache 2.0")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .version("1.0.2")
            .build();
    }
    
    @Bean
    public Docket apiDocket() {
             
       Docket docket =  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("edu.moduloalumno.api"))
                .paths(PathSelectors.any())
                .build();
       
       return docket;
       
    }
   
    @Bean
    UiConfiguration uiConfig() {
        return UiConfigurationBuilder
                .builder()
                .operationsSorter(OperationsSorter.METHOD)
                .build();
    }
}