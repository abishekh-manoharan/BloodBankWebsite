package com.assignment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodStockRepository extends CrudRepository<BloodStock, Integer>{

}
