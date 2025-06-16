package org.jimisaac.springmvc.Facade;

import lombok.RequiredArgsConstructor;
import org.jimisaac.springmvc.model.Product;
import org.jimisaac.springmvc.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductFacade {
    private final ProductService productService;

    public List<Product> getAllProducts() {
        return productService.getAllProducts(null);
    }

    public Product getProductById(String id) {
        return productService.getProductById(id);
    }

    public Product saveProduct(Product product) {
        return productService.saveProduct(product);
    }

    public void deleteProduct(String id) {
        productService.deleteProduct(id);
    }
}