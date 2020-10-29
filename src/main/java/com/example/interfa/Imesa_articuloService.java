package com.example.interfa;
import java.util.Optional;
import java.util.List;
import com.example.model.mesa_articulosModel;

public interface Imesa_articuloService {
    
    
    public List<mesa_articulosModel>findAll();
    
    
    public Long save(mesa_articulosModel persona);

    public void delete(int id);
    
    public Optional<mesa_articulosModel>ListId(int id);
}
