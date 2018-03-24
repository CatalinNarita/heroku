package com.edu.control.dao;

import com.edu.entity.ItemHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by catal on 1/14/2018
 */
public interface ItemHistoryDAO extends JpaRepository<ItemHistory, Long>{

    List<ItemHistory> getItemHistoryByUserId(Long userId);

}
