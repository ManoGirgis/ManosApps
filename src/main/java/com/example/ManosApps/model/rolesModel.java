package com.example.ManosApps.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class rolesModel {

    private int id;
    private String name;
    private String description;
}