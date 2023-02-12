package com.andoliver46.SecutiryTestApp.repositories;

import com.andoliver46.SecutiryTestApp.model.CategoryModel;
import com.andoliver46.SecutiryTestApp.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, UUID> {
}
