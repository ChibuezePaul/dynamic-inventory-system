package com.inventory.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
    UserRepo userRepo;
	
	@Override
	public String addUser(User user) {
		userRepo.save(user);
		return "User Added";
	}

	@Override
	public User editUser(Long id, User user) {

		User editUser = userRepo.getOne(id);

		editUser.setName(user.getName());
		editUser.setActive(user.getActive());
		editUser.setDateModified(LocalDate.now());
		
		return userRepo.save(editUser);
	}

	@Override
	public String deleteUser(Long id) {
		userRepo.deleteById(id);
		return "User Deleted";
	}

	@Override
	public String deactivateUser(Long id) {
		User user = userRepo.getOne(id);
		user.setActive(0);
		userRepo.save(user);
		return "User Deactivated";
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}
	
	@Override
	public User getUser(Long id) {
		return userRepo.getOne(id);
	}
}