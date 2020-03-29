package everis.cad;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class AdminApplication
{

	public static void main ( String[ ] args )
	{
		new SpringApplicationBuilder ( AdminApplication.class ).web ( WebApplicationType.REACTIVE ).run ( args );
	}
}
