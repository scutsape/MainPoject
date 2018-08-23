package com.kb.manager.service.impl;

import com.kb.manager.dao.ServiceDAO;
import com.kb.manager.entity.Services;
import com.kb.manager.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServicesServiceImpl implements ServicesService {
    @Autowired
    private ServiceDAO serviceDAO;

    @Override
    public Services deleteById(int id) {
        return serviceDAO.deleteById(id);
    }

    @Override
    public Services findById(int id) {
        return serviceDAO.findById(id);
    }

    @Override
    public void save(Services services) {
        serviceDAO.save(services);
    }

    @Override
    public Services findOne(int id) {
        return serviceDAO.findOne(id);
    }

    @Override
    public void save(String serviceName, String serviceDescription, double servicePrice) {
        Services services = new Services(serviceName, serviceDescription, servicePrice);
        serviceDAO.save(services);
    }

    @Override
    public void delete(int id) {
        serviceDAO.delete(id);
    }

    @Override
    public void delete(Services services) {
        serviceDAO.delete(services);
    }

    @Override
    public List<Services> findAll() {
        return serviceDAO.findAll();
    }
}
