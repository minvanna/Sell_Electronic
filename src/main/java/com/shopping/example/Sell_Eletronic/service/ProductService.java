package com.shopping.example.Sell_Eletronic.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.shopping.example.Sell_Eletronic.entity.Product;

public interface ProductService {
    List<Product> getAll();
    Product getById(Long id);
    Product save(Product product);
    Product update(Long id, Product newProduct);
    String delete(Long id);

    // បន្ថែម Search
    List<Product> search(String keyword);

    // បន្ថែម Image Upload
    Product uploadImage(Long id, MultipartFile file);
}