package com.example.controller;

import java.util.HashMap;

import com.example.model.IvaModel;
import com.example.service.IvaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class IvaController {
    

    @Autowired
    IvaServiceImpl ivaServiceImpl;


    @PostMapping(value="/iva/add")
    public HashMap add(@ModelAttribute IvaModel ivaParameters) {
        try {
            HashMap<String,String> map = new HashMap<>();
            Long repuesta = ivaServiceImpl.save(ivaParameters);
            map.put("id_iva", String.valueOf(repuesta));
            return map;
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return null;
    }
    
}
