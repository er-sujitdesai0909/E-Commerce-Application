package com.SD.E_Comm.Controller;

import com.SD.E_Comm.Model.Product;
import com.SD.E_Comm.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class productController {
    @Autowired
    private Service service;
    @GetMapping("/products")
    public ResponseEntity<List<Product>> showAll(){
        List<Product> products = service.showAll();
        return new ResponseEntity<>(products, HttpStatus.ACCEPTED);
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") int productId){
        Product p = service.findById(productId);
        return new ResponseEntity<>(p,HttpStatus.OK);
    }
    @GetMapping("/product/{id}/image")
    public ResponseEntity<byte[]> getImage(@PathVariable("id") int imageId){
        Product p = service.getImage(imageId);
        return new ResponseEntity<>(p.getImageData(),HttpStatus.ACCEPTED);
    }
    @PostMapping("/product")
    public ResponseEntity<?> saveOrupdate(@RequestPart Product product,@RequestPart MultipartFile imageFile){
        Product p = null;
        try {
            p=service.save(product,imageFile);
            return new ResponseEntity<>(p,HttpStatus.ACCEPTED);
        } catch (IOException e) {

            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }
    @PutMapping("/product/{id}")
    public ResponseEntity<String> update(@PathVariable("id") Long productId,@RequestPart Product product , @RequestPart MultipartFile imageFile){
            Product p = null;
        try {
            p = service.update(product,imageFile);
            return new ResponseEntity<>("Product Updated Successfully",HttpStatus.ACCEPTED);
        } catch (IOException e) {
            //throw new RuntimeException(e);
            return new ResponseEntity<>("Failed"+e.getMessage(),HttpStatus.BAD_REQUEST);
        }
       // return new ResponseEntity<>("Product Updated Successfully",HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/product/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        Product p = service.findById(id);
        service.delete(id);
        return new ResponseEntity<>(p,HttpStatus.OK);
    }
    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> search(@RequestParam String keyword){
        List<Product> products = service.search(keyword);
        return new ResponseEntity<>(products,HttpStatus.ACCEPTED);
    }

}
