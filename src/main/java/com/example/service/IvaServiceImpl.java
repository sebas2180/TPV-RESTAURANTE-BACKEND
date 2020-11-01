package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.Repository.IvaRepository;
import com.example.interfa.iIvaService;
import com.example.model.IvaModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IvaServiceImpl implements iIvaService {

    @Autowired
    IvaRepository IvaRepository;

    @Override
    public List<IvaModel> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long save(IvaModel ivaParameters) {
        try {
            IvaModel iva = IvaRepository.saveAndFlush(ivaParameters);
            return iva.getId_iva();
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub

    }

    @Override
    public Optional<IvaModel> ListId(int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
