package com.kkworld.sre.tacocloud.repositorys;

import com.kkworld.sre.tacocloud.models.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
