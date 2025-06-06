package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.UserRepository;
import com.educandoweb.course.entities.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> FindAll() {
		return userRepository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();

	}

}
