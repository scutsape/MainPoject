package com.kb.manager.dao;

import com.kb.manager.entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDAO extends JpaRepository<Services,Integer>{
    Services findById(int id);
    Services deleteById(int id);
}
