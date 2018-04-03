package kr.hs.emirim.progh2.greeter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.emirim.progh2.greeter.greeter.Greeter;

@Configuration
public class AppContext {
	
	@Bean
	Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");
		return g;
	}
	
}
