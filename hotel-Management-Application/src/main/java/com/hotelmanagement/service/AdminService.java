package com.hotelmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanagement.exception.ResourceNotFoundException;
import com.hotelmanagement.model.Admin;
import com.hotelmanagement.model.User;
import com.hotelmanagement.repository.AdminRepository;
import com.hotelmanagement.repository.UserRepository;

@Service
public class AdminService{
	@Autowired
private AdminRepository adminRepository;

	@Autowired
	private UserRepository userRepository;
	
	
	

	public Admin saveAdmin(Admin admin) {
		System.out.println("admin register service"+admin);

		return adminRepository.save(admin);
	}

	public Admin loginAdmin(Admin admin) {
		return this.adminRepository.findByAdminEmailIdAndAdminPassword(admin.adminEmailId,admin.adminPassword).orElseThrow(()->new ResourceNotFoundException("Admin ", "Id",admin.adminEmailId+"and password "+admin.adminPassword ));
	}

	public List<User> getAllUsers(long adminId) {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

			
		

		
}