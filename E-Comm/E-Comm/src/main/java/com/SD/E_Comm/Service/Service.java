package com.SD.E_Comm.Service;

import com.SD.E_Comm.Model.Product;
import com.SD.E_Comm.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repo repo;

    public List<Product> showAll() {
        return repo.findAll();
    }

    public Product findById(int productId) {
        return repo.findById(productId).orElse(new Product());
    }

    public Product save(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        repo.save(product);
        return product;
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

    public Product getImage(int imageId) {
        Product p = repo.findById(imageId).orElse(new Product());
        return p;
    }

    public List<Product> search(String keyword) {
            List<Product> list = repo.search(keyword);
            return list;
    }

    public Product update(Product product, MultipartFile imageFile) throws IOException {
        //if(imageFile!=null && !imageFile.isEmpty()){
            product.setImageName(imageFile.getOriginalFilename());
            product.setImageType(imageFile.getContentType());
            product.setImageData(imageFile.getBytes());
        //}
        repo.save(product);
        return product;
    }
}
