package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.User;
import co.edu.sena.repository.UserRepository;

@Service
public class UserServiceimpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public Optional<User> findById(Integer id) {
		
		return userRepository.findById(id);
	}

	@Override
	public List<User> findAll() {
		
		return userRepository.findAll();
	}

	@Override
	public User save(User e) {
		
		return userRepository.save(e);
	}

	@Override
	public void deletById(Integer id) {
		userRepository.deleteById(id);
		
	}
	
}
