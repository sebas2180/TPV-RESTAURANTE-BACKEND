package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.Repository.mesa_articulosRepository;
import com.example.interfa.Imesa_articuloService;
import com.example.model.mesa_articulosModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mesa_articuloServiceImpl implements Imesa_articuloService {


    @Autowired
    mesa_articulosRepository mesa_articulosRepository;

    @Override
    public List<mesa_articulosModel> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long save(mesa_articulosModel item) {
        try {
            mesa_articulosModel mesa = mesa_articulosRepository.saveAndFlush(item);
            return item.getId();
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
    public Optional<mesa_articulosModel> ListId(int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
