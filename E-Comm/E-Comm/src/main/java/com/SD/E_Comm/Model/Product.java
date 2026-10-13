package com.SD.E_Comm.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Date;
@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  private String brand;
  private BigDecimal price;
  private String category;
  @JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd")
  private Date releaseDate;
  private boolean productAvailable;
  private int stockQuantity;
  private String imageName;
  private String imageType;
  @Lob//Large Binary Object
  private byte[] imageData;
}


