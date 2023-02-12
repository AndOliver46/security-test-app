package com.andoliver46.SecutiryTestApp.services;

import com.andoliver46.SecutiryTestApp.dtos.ProductModelDTO;
import com.andoliver46.SecutiryTestApp.model.ProductModel;
import com.andoliver46.SecutiryTestApp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    @Transactional(readOnly = true)
    public List<ProductModelDTO> findAll() {
        List<ProductModel> models = repo.findAll();
        return models.stream().map(x -> new ProductModelDTO(x)).toList();
    }
}
