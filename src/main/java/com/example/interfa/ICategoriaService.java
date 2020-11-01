/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.interfa;


import java.util.List;

import com.example.model.CategoriaModel;

/**
 *
 * @author Sebas
 */
public interface ICategoriaService {

    public List<CategoriaModel> getAllArticulos();

    public String update(CategoriaModel CategoriaModel);

    public Long save(CategoriaModel categoriaModel);
    
}
