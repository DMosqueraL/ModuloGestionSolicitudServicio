package apiserviciotransporte.apiserviciotransporte;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiserviciotransporteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiserviciotransporteApplication.class, args);
	}

	@Bean
	public OpenAPI myOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Módulo Gestión Solicitud Servicio")
						.version("1.0")
						.description("API MGSS")
						.contact(new Contact()
								.name("MGSS - SSMU")
								.email("doris.mosqueral@edu.edu.co"))
						.termsOfService("http://swagger.io/terms/")
						.license(new License()
								.name("Apache License")
								.url("http://www.apache.org/licenses/")));
	}

}
