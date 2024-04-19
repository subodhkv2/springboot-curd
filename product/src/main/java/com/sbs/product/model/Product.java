package com.sbs.product.model;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;
@Data
@Document("product")
public class Product {
    private String id;
    private String name;
    private BigDecimal price;


}
