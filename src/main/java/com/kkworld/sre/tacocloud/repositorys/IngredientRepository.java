package com.kkworld.sre.tacocloud.repositorys;

import com.kkworld.sre.tacocloud.models.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
