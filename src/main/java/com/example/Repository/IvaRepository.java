package com.example.Repository;
import com.example.model.IvaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IvaRepository extends JpaRepository<IvaModel,Long> {
    
    IvaModel saveAndFlush(IvaModel IvaModel );
    
}
