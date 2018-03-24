package com.edu.control.dao;

import com.edu.control.dto.ItemDTO;
import com.edu.entity.Item;
import com.edu.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDAO extends JpaRepository<Item, Long>{

    @Modifying
    void deleteItemByProductId(Long id);

    Item getItemByProductIdAndCartId(Long productId, Long cartId);

}
