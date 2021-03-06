package at.lernplattform.domain.usecase;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;

import at.lernplattform.application.users.LoginUserCommand;
import at.lernplattform.application.users.WrongCredentialsException;
import at.lernplattform.domain.user.User;
import at.lernplattform.domain.user.UserRepository;
import at.lernplattform.infrastructure.TokenService;

public class LoginUser {

	private UserRepository userRepository;
	private LoginUserCommand command;
	private TokenService tokenService;
	private PasswordEncoder encoder;

	public LoginUser(UserRepository userRepository, LoginUserCommand command, TokenService tokenService,
			PasswordEncoder encoder) {
		this.userRepository = userRepository;
		this.command = command;
		this.tokenService = tokenService;
		this.encoder = encoder;
	}

	public String[] login() {
		Optional<User> potentialUser = userRepository.findUser(command.getEmail());
		User user = potentialUser.orElseThrow(WrongCredentialsException::new);
		if (!encoder.matches(command.getPassword(), user.getPassword())) {
			throw new WrongCredentialsException();
		}
		return new String[] {tokenService.generateToken(user.getId()), user.getId()};
		//return tokenService.generateToken(user.getId());
	}

}
