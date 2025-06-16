package org.jimisaac.springmvc.service;

import lombok.RequiredArgsConstructor;
import org.jimisaac.springmvc.model.Product;
import org.jimisaac.springmvc.repository.ProductRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts(String category) {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        return productRepository.findById(id).get();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

//    @Scheduled(fixedRate = 5000)
//    public void log(){
//        int count = (int) productRepository.count();
//        System.out.println("The total number of products is:"+count);
//    }
}
