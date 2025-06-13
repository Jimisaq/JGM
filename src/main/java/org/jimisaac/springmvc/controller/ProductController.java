package org.jimisaac.springmvc.controller;

import lombok.RequiredArgsConstructor;
import org.jimisaac.springmvc.model.Product;
import org.jimisaac.springmvc.repositiry.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepo;

    @RequestMapping("/")
    public String product() {
        return "index";
    }

    @RequestMapping(path="/products/add",method = RequestMethod.GET)
    public String createProduct(Model model) {
        model.addAttribute("product", new Product());
        return "edit_product";
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public String saveProduct(Product product) {
        productRepo.save(product);
        return "redirect:/products";
    }

    @RequestMapping(path = "/products",method=RequestMethod.GET)
    public String getAllProducts(Model model){
        model.addAttribute("products", productRepo.findAll());
        return "products";
    }

    @RequestMapping(path = "/products/edit/{id}", method = RequestMethod.GET)
    public String editProduct(Model model,@PathVariable(value = "id") String id) {
        model.addAttribute("product", productRepo.findById(id));
        return "edit_product";
    }

    @RequestMapping(path = "/products/delete/{id}", method = RequestMethod.POST)
    public String deleteProduct(@PathVariable(value = "id") String id) {
        productRepo.deleteById(id);
        return "redirect:/products";
    }

}
