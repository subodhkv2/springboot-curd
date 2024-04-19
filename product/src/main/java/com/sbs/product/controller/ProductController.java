package com.sbs.product.controller;

import com.sbs.product.model.Product;
import com.sbs.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/saveProduct")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.saveProduct(product));
    }
    @PutMapping("/updateProduct")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.updateProduct(product));
    }
    @GetMapping("/getById")
    public ResponseEntity<Optional<Product>> getById(@RequestParam String id) {
        return ResponseEntity.ok(productService.getProduct(id));
    }
    @GetMapping("/getAllProduct")
    public ResponseEntity<List<Product>> getAllProduct() {
        return ResponseEntity.ok(productService.getAllProduct());
    }
    @DeleteMapping("/deleteProduct")
    public void DeleteProduct(String id) {
        productService.deleteProduct(id);
    }
}
