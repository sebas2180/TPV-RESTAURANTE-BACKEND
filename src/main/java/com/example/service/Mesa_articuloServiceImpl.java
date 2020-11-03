package com.example.service;

import java.util.HashMap;
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

    @Autowired
    MesaServiceImpl MesaServiceImpl;

    @Override
    public List<mesa_articulosModel> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long save(mesa_articulosModel item) {
        try {
            item.setMesa(MesaServiceImpl.findBy_numero(item.getMesa().getNumero()));
            mesa_articulosModel mesa = mesa_articulosRepository.saveAndFlush(item);
            return item.getId();
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }

    @Override
    public Optional<mesa_articulosModel> ListId(int id) {
        return null;
    }

    @Override
    public String update(mesa_articulosModel mesa_articulosParameters) {
        Optional<mesa_articulosModel> categoriaOptional = mesa_articulosRepository
                .findById(mesa_articulosParameters.getId());
        if (!categoriaOptional.isPresent()) {
            String repuesta = "item no encontrado.";
            return repuesta;
        }
        mesa_articulosRepository.save(mesa_articulosParameters);
        String repuesta = "Actualización exitosa.";
        return repuesta;

    }

    @Override
    public HashMap delete(Long id) {
          HashMap<String,String> map = new HashMap<>();
        if (mesa_articulosRepository.findById(id).isPresent()) {				
            mesa_articulosRepository.deleteById(id);	
                     map.put("status", "200");
                     map.put("Mensaje", "Item eliminado correctamente.");
                    return map;			
                }
        map.put("status", "201");
        map.put("Mensaje", "Error! El item no existe");
                return map;
    }
    // @Override
	// public String exist_item(Long id_categoria, Long id_articulo) {
	// 	return mesa_articulosRepository.exist_item(id_categoria, id_articulo);
    // }
    
    public List<mesa_articulosModel> findBy_nroMesa(Long numero) {
		return mesa_articulosRepository.findBy_nroMesa(numero);
	}
    
}
