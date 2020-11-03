package com.example.interfa;
import java.util.Optional;
import java.util.List;
import com.example.model.MesaModel;

public interface IMesaService {
    

    public List<MesaModel>findAll();

    public MesaModel findBy_numero(long numero);
    
    
    public Long save(MesaModel persona);

    public void delete(int id);
    
    public Optional<MesaModel>ListId(int id);

    public String update(MesaModel MesaModel);
}
