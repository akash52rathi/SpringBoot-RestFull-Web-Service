package com.example.demo.Controller;


import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class productController  {


    @Autowired
    private ProductService service;


    @PostMapping("/addproducts")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{name}")
    public Product findProductByName(@PathVariable  String name) {
        return service.getproductByname(name);
    }

    @GetMapping("/product/{id}")

    public  Product findProductById(@PathVariable int id)
    {
        return  service.getProductById(id);
    }

    @DeleteMapping("/product/{id}")
    public  String deleteProduct(@PathVariable int id)
    {
        return service.deleteProduct(id);
    }



}
