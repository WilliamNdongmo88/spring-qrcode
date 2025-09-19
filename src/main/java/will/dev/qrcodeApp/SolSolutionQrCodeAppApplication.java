package will.dev.qrcodeApp;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SolSolutionQrCodeAppApplication {

    private final Environment environment;

    public SolSolutionQrCodeAppApplication(Environment environment) {
        this.environment = environment;
    }

    public static void main(String[] args) {
        SpringApplication.run(SolSolutionQrCodeAppApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*");
            }
        };
    }

    @PostConstruct
    public void testDBEnvVars() {
        System.out.println("===================================");
        System.out.println("DB URL: " + System.getProperty("DATABASE_URL"));
        System.out.println("DB USER: " + System.getProperty("DATABASE_USERNAME"));
        System.out.println("MAIL_USERNAME = " + System.getProperty("MAIL_USERNAME"));
        System.out.println("👉 lienDuSite: " + System.getProperty("API_URL"));
        System.out.println("👉 BaseUrl: " + System.getProperty("BASE_URL"));
        System.out.println("===================================");
    }
}
