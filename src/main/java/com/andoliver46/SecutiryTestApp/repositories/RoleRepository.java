package com.andoliver46.SecutiryTestApp.repositories;

import com.andoliver46.SecutiryTestApp.model.CategoryModel;
import com.andoliver46.SecutiryTestApp.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Integer> {
}
