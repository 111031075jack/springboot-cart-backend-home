package com.example.demo.cart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.cart.exception.UserNotFoundException;
import com.example.demo.cart.model.dto.FavoriteProductDTO;
import com.example.demo.cart.model.dto.FavoriteUserDTO;
import com.example.demo.cart.model.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserDTO findByUsername(String username) throws UserNotFoundException {
		
		return null;
	}

	@Override
	public UserDTO saveUser(UserDTO userDTO) {
		
		return null;
	}

	@Override
	public List<FavoriteProductDTO> getFavoriteProductDTO(Long userId) {
		
		return null;
	}

	@Override
	public List<FavoriteUserDTO> getFavoriteUserDTOs(Long productId) {
		
		return null;
	}

	@Override
	public void addFavoriteProduct(Long userId, Long productId) {
		
		
	}

	@Override
	public void removeFavoriteProduct(Long userId, Long productId) {
		
		
	}

}
