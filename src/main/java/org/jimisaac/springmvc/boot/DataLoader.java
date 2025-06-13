package org.jimisaac.springmvc.boot;

import lombok.RequiredArgsConstructor;
import org.jimisaac.springmvc.model.Product;
import org.jimisaac.springmvc.repositiry.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final ProductRepository productRepository;

    public void run(String... args) throws Exception {
        Product product = new Product();
        product.setName("Milky Bar");
        product.setDescription("Milky Bar with chocolate and hazelnut");
        product.setType("CANDIES");
        product.setCategory("BARS");
        product.setPrice(1.99);
        //productRepository.save(product);

        Product product2 = new Product();
        product2.setName("Bread");
        product2.setDescription("Bread with chocolate and hazelnut");
        product2.setType("CANDIES");
        product2.setCategory("BARS");
        product2.setPrice(2.99);
        //productRepository.save(product2);
    }
}
