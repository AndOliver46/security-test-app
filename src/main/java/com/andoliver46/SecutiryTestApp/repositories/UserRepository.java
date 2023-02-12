package com.andoliver46.SecutiryTestApp.repositories;

import com.andoliver46.SecutiryTestApp.model.CategoryModel;
import com.andoliver46.SecutiryTestApp.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {

    Optional<UserModel> findByUsername(String username);

}
