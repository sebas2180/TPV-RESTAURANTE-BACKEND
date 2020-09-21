/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.interfa;

import com.example.Repository.articuloRepository;
import com.example.model.articuloModel;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author sebastian
 */
public interface IArticuloService {
    
     public HashMap delete(Long id);
     
    public Long save(articuloModel articuloModel) ;
    
    public Optional<articuloModel> getFile(Long id);
     
     public List<articuloModel> getAllArticulos  ();
}
