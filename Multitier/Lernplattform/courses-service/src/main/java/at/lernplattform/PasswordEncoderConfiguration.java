package at.lernplattform;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderConfiguration {

	@Bean
	private PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
