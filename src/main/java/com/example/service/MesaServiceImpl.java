package com.example.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.example.Repository.MesaRepository;
import com.example.interfa.IMesaService;
import com.example.model.MesaModel;
import com.example.model.detalle_facturaModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesaServiceImpl implements IMesaService {

    @Autowired
    private MesaRepository mesaRepository;

    @Override
    public List<MesaModel> findAll() {
        return   mesaRepository.findAll() ;

    }

    @Override
    public Long save(MesaModel mesaParameters) {
       try {
           MesaModel mesa = mesaRepository.saveAndFlush(mesaParameters);
           return mesa.getId();
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
    public Optional<MesaModel> ListId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String update(MesaModel mesaParameters) {
        Optional<MesaModel> categoriaOptional = mesaRepository.findById(mesaParameters.getId());
        if (!categoriaOptional.isPresent()){
            String repuesta =  "item no encontrado.";
            return repuesta;
        }
        mesaRepository.save(mesaParameters);
        String repuesta =  "Actualización exitosa.";
        return repuesta;
    }

    @Override
    public MesaModel findBy_numero(long numero) {
       
        return mesaRepository.findBy_numero(numero);
    }

    @Override
    public HashMap findTotalBy_numero(long numero) {
        HashMap<String,String> map = new HashMap<>();
        try {
            detalle_facturaModel  me= mesaRepository.findTotalBy_numero(numero);
            System.out.println(me.getTotal_mesa());
            map.put("total", "");
            map.put("porcentaje_cuota", "");
            map.put("cuota", "");
            return map;
        } catch (Exception e) {
            System.err.println(e);
        }
        return map;
    }


}
