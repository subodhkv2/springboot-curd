package com.sbs.product.repository;
import com.sbs.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends MongoRepository<Product , String> {
}
