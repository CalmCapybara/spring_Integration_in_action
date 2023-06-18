package com.calmcapybara.springintegrationclient.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class MailTacoRecipe {
    private String emailAddress;
    private List<Taco> tacoList = new ArrayList<>();

    public void addTaco(Taco taco) {
        tacoList.add(taco);
    }
}
