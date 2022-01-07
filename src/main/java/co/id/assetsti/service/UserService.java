package co.id.assetsti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import co.id.assetsti.model.User;
import co.id.assetsti.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public User register(User newUser) {
		newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
		return userRepository.save(newUser);
	}
	
	public User login(String username, String password) {
		User user = null;
		if (user==null) 
			return null;

		Boolean isPasswordMatches = bCryptPasswordEncoder.matches(password, user.getPassword());
		if (!isPasswordMatches)
			return null;
		
		return user;
	}
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public User getUserById(Integer id) {
		return userRepository.getById(id);
	}
	
}
