package in.pavanreddy.samplespringpro.swagger;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityScheme.Type;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfigurationService {
    @Bean
    public OpenAPI crmServiceOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("First Partner Consulting Services API")
                        .description("API documentation for the Customer Relationship Management (CRM)")
                        .version("1.0")
                        .contact(new Contact()
                                .name("First Partner Consulting Services")
                                .email("support@firstpartnerconsulting.com")
                                .url("https://firstpartnerconsulting.com/")))
                .addSecurityItem(new SecurityRequirement().addList("JWT"))
                .components(new io.swagger.v3.oas.models.Components()
                        .addSecuritySchemes("JWT", new SecurityScheme()
                                .type(Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));
    }
}