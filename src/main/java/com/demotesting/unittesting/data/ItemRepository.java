package com.demotesting.unittesting.data;

import com.demotesting.unittesting.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
