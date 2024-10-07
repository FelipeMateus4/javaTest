package com.projeto.demo.Controllers;

import com.projeto.demo.models.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

@Autowired 
private productsService productsService;

}
