package com.calmcapybara.springintegrationclient.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Taco implements Serializable {
    private Long id;
    private String name;
    private List<Ingredient> ingredientList = new ArrayList<>();

}
