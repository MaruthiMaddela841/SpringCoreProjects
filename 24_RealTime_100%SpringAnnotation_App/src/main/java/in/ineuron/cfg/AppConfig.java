package in.ineuron.cfg;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"in.ineuron"})
public class AppConfig {
	
	static {
		System.out.println("AppConfig .class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig object is created......");
	}
	
	@Bean(value="date1")
	public Date createDateTime1() {
		System.out.println("AppConfig.createDateTime1()...");
		return new Date();
		
	}
	
	@Bean(value="date2")
	public Date createDateTime2() {
		System.out.println("AppConfig.createDateTime2()...");
		return new Date();
		
	}

}
