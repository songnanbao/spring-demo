package songnan.bao.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SwaggerConfig {

    @Value("${springfox.documentation.swagger-ui.enabled}")
    private boolean enabled;

    @Value("${springfox.documentation.swagger-ui.contact.fullname}")
    private String contactFullname;

    @Value("${springfox.documentation.swagger-ui.contact.website}")
    private String contactWebsite;

    @Value("${springfox.documentation.swagger-ui.contact.email}")
    private String contactEmail;

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enabled)
                .apiInfo(apiInfo())
                .select()
//                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("songnan.bao.demo.controller"))
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot Demo")
                .description("This is a sample project with Spring Boot")
                .contact(new Contact(contactFullname, contactWebsite, contactEmail))
                .version("1.0")
                .build();
    }
}