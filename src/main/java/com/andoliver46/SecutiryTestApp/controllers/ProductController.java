package com.andoliver46.SecutiryTestApp.controllers;

import com.andoliver46.SecutiryTestApp.dtos.ProductModelDTO;
import com.andoliver46.SecutiryTestApp.model.ProductModel;
import com.andoliver46.SecutiryTestApp.repositories.ProductRepository;
import com.andoliver46.SecutiryTestApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductModelDTO>> findAll(){
        List<ProductModelDTO> dtos = service.findAll();
        return ResponseEntity.ok().body(dtos);
    }

}
