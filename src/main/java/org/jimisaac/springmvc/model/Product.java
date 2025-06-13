package org.jimisaac.springmvc.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@RequiredArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;
    private String type;
    private String category;
    private double price;
}
