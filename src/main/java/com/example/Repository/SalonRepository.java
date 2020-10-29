package com.example.Repository;

import javax.transaction.Transactional;

import com.example.model.SalonModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface SalonRepository extends JpaRepository<SalonModel,Long>{ 


    SalonModel saveAndFlush(SalonModel SalonModel );
    
}
