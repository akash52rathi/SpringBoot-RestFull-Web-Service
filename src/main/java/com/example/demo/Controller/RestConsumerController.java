package com.example.demo.Controller;

import com.example.demo.Entity.Product;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;

public class RestConsumerController {

    private  static final String GET_ALL_PRODUCT_API = "http://localhost:8080/products";
    private  static  final String ADD_NEW_PRODUCT_API ="http://localhost:8080/addproducts";
    private  static  final String GET_PRODUCT_BY_ID = "http://localhost:8080/product/{id}";

    private  static RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {

        CallGetAllProductApi();
        CallGetProductByidApi();
        CallAddnewProduct();
        CallGetAllProductApi();
    }

    private  static  void CallGetAllProductApi()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters",headers);
        ResponseEntity<String> result = restTemplate.exchange(GET_ALL_PRODUCT_API, HttpMethod.GET,entity,String.class);
        System.out.println("###########################CallGetForProduct");
        System.out.println(result);
    }

    private  static void CallGetProductByidApi()
    {
        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("id",2);
        Product p1 = restTemplate.getForObject(GET_PRODUCT_BY_ID,Product.class,mp);
        System.out.println("##################GetForProduct");
        System.out.println(p1);

    }

    private  static  void  CallAddnewProduct()
    {
        Product p1 = new Product(5,"headset",70,2000);
        ResponseEntity<Product> response = restTemplate.postForEntity(ADD_NEW_PRODUCT_API,p1,Product.class);
        System.out.println("######PostnewProduct");
        System.out.println(response.getBody());

    }








}
