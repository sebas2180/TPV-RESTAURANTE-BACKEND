package com.example.interfa;
import java.util.Optional;
import java.util.List;
import java.util.HashMap;
import com.example.model.mesa_articulosModel;

public interface Imesa_articuloService {
    
    
    public List<mesa_articulosModel>findAll();
    
    
    public Long save(mesa_articulosModel persona);

    public HashMap delete(Long id);
    
    public Optional<mesa_articulosModel>ListId(int id);

    
    public String update(mesa_articulosModel mesa_articulosModel);
}
