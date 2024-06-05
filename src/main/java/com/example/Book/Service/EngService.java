package com.example.Book.Service;

import com.example.Book.Entity.EngCourse;
import com.example.Book.Repository.EngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EngService {

    @Autowired
    private EngRepository engRepository;


    public List<EngCourse> getAllENG() {
        return engRepository.findAll();
    }



    public EngCourse addENG(EngCourse engCourse) {
        engRepository.save(engCourse);
        return engCourse;
    }



    public void updateENG(Long id) {
        EngCourse eng1 = engRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(""+id));
        engRepository.save(eng1);
    }



    public void sellENG(Long id) {
        EngCourse eng2 = engRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(""+id));
        engRepository.delete(eng2);
    }
}
