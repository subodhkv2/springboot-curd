package com.sbs.product.service;
import com.sbs.product.model.Product;
import com.sbs.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product) {
       return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Optional<Product> product1 = productRepository.findById(product.getId());
        if (product1.isPresent()){
            Product exitProduct = product1.get();
            exitProduct.setName(product.getName());
            exitProduct.setPrice(product.getPrice());
            return productRepository.save(exitProduct);
        } else {
            return null;
        }
    }


    @Override
    public Optional<Product> getProduct(String id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
