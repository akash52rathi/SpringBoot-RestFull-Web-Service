package com.example.demo.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepository;
import org.hibernate.loader.collection.OneToManyJoinWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private  ProductRepository repository;


    public Product saveProduct(Product product)
    {
        return repository.save(product);
    }

    public List<Product> getProducts()
    {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public  Product getproductByname(String name)
    {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

}
