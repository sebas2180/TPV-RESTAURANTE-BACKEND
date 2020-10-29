package com.example.interfa;

import com.example.model.IvaModel;
import java.util.List;
import java.util.Optional;

public interface iIvaService {
    
    
    public List<IvaModel>findAll();
    
    
    public Long save(IvaModel persona);

    public void delete(int id);
    
    public Optional<IvaModel>ListId(int id);
}
