package org.jimisaac.springmvc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.jimisaac.springmvc.model.Product;
import org.jimisaac.springmvc.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
@Tag(name="JGM products API", description="Operations related to products")
public class ProductRestController {
    private final ProductRepository productRepo;

    @GetMapping("/all")
    @Operation(summary = "Retrieve all products")
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    // Add other REST endpoints as needed
}