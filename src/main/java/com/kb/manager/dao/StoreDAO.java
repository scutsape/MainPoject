package com.kb.manager.dao;

import com.kb.manager.entity.Cities;
import com.kb.manager.entity.Store;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StoreDAO extends JpaRepository<Store,Integer> {

    Store deleteById(int id);
    Store findById(int id);

}
