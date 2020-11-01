package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.Repository.SalonRepository;
import com.example.interfa.ISalonService;
import com.example.model.SalonModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalonServiceImpl implements ISalonService {

    @Autowired
    private SalonRepository SalonRepository;

    @Override
    public List<SalonModel> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long save(SalonModel salonParameters) {
       try {
           SalonModel salon = SalonRepository.saveAndFlush(salonParameters);
           return salon.getId();
       } catch (Exception e) {
           System.out.println(e);
       }
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub

    }

    @Override
    public Optional<SalonModel> ListId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String update(SalonModel salonParameters) {
        Optional<SalonModel> categoriaOptional = SalonRepository.findById(salonParameters.getId());
        if (!categoriaOptional.isPresent()){
            String repuesta =  "item no encontrado.";
            return repuesta;
        }
        SalonRepository.save(salonParameters);
        
        String repuesta =  "Actualización exitosa.";
        return repuesta;
  
    }
    
}
