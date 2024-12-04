package com.example.ManosApps.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pics")
public class picsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String url;
    private String createdAt;
    private int userId;
    private String extension;
    //private Byte bytes;
    private String size;
    private String type;
    private String description;
}
