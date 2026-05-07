package com.shopping.example.Sell_Eletronic.service.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.shopping.example.Sell_Eletronic.entity.Product;
import com.shopping.example.Sell_Eletronic.repository.ProductRepository;
import com.shopping.example.Sell_Eletronic.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepo;  

    //folder save image
    private final String UPLOAD_DIR = "uploads/products/";

    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Product getById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product update(Long id, Product newProduct) {
        Product product = productRepo.findById(id).orElse(null);
        if (product != null) {
            product.setName(newProduct.getName());
            product.setBrand(newProduct.getBrand());
            product.setPrice(newProduct.getPrice());
            product.setQty(newProduct.getQty());
            product.setDescription(newProduct.getDescription());
            product.setImage(newProduct.getImage());
            product.setCategoryId(newProduct.getCategoryId()); 
            return productRepo.save(product);
        }
        return null;
    }

    @Override
    public String delete(Long id) {
        productRepo.deleteById(id);
        return "Delete Success";  
    }


    @Override
    public List<Product> search(String keyword) {
        return productRepo.searchByKeyword(keyword);
    }

    //Image Upload
    @Override
    public Product uploadImage(Long id, MultipartFile file) {

        Product product = productRepo.findById(id).orElse(null);
        if (product == null) {
            throw new RuntimeException("Product not found");
        }

        if (file.isEmpty()) {
            throw new RuntimeException("File is empty");
        }

        try {
            
            String uploadDir = System.getProperty("user.dir") + "/uploads/products/";
            File dir = new File(uploadDir);
            if (!dir.exists()) dir.mkdirs();

            
            String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();

            Path filePath = Paths.get(uploadDir + fileName);

            Files.write(filePath, file.getBytes());

            
            product.setImage("/uploads/products/" + fileName);

            return productRepo.save(product);

        } catch (IOException e) {
            e.printStackTrace();  
            throw new RuntimeException("Upload failed: " + e.getMessage());
        }
    }
}
