package com.kkworld.sre.tacocloud.repositorys;

import com.kkworld.sre.tacocloud.models.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
