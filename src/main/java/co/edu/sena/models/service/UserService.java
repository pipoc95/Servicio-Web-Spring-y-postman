package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;
import co.edu.sena.models.entity.User;

public interface UserService {

	public Optional<User>findById(Integer id);
	public List<User>findAll();
	public User save(User e);
	public void deletById(Integer id);
}
