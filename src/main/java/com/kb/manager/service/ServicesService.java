package com.kb.manager.service;


import com.kb.manager.entity.Services;


import java.util.List;

public interface ServicesService {
    Services deleteById(int id);
    Services findById(int id);
    void save(Services services);
    Services findOne(int id);
    void save(String serviceName, String serviceDescription, double servicePrice);
    void delete(int id);
    void delete(Services services);
    List<Services> findAll();
}
