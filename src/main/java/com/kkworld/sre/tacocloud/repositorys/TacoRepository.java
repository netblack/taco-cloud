package com.kkworld.sre.tacocloud.repositorys;

import com.kkworld.sre.tacocloud.models.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}
