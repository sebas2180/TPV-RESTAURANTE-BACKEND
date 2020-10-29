package com.example.interfa;
import java.util.Optional;

import com.example.model.SalonModel;

import java.util.List;
public interface ISalonService {
    

    
    public List<SalonModel>findAll();
    
    public Long save(SalonModel persona);

    public void delete(int id);
    
    public Optional<SalonModel>ListId(int id);
}
