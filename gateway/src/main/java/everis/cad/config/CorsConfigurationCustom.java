package everis.cad.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * This class enables CORS support in API gateways and AUTH server.
 * <p>
 * some load balancer as HA-proxy will be used.
 */
@Configuration
public class CorsConfigurationCustom {

    /**
     * CORS filter.
     *
     * @return the CORS filter
     */
    @Bean
    public CorsFilter corsFilter() {
        // Enable CORS requests
        final CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");

        final UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", config);

        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
}
