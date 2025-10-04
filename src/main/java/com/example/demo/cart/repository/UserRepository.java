package com.example.demo.cart.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.cart.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	// 多筆查詢
	List<User> findByUsername(String username);
	
	// 單筆查詢
	Optional<User> findFirstByUsername(String username);
	
	// 利用原生 sql
	@Query(value = "select * from user where username = :username", nativeQuery = true)
	Optional<User> findByUsernameNative(@Param("username") String username);
	
}
