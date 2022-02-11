package com.datasite.react.workshop.be.service;

import com.datasite.react.workshop.be.model.Chair;
import com.datasite.react.workshop.be.repository.ChairRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ChairService {
    
    private final ChairRepository chairRepository;

    public ChairService(ChairRepository chairRepository) {
        this.chairRepository = chairRepository;
    }

    public Chair getChair(String id) {
        return chairRepository.findById(id).orElseThrow(() -> new RuntimeException("No Chair found with id="+id));
    }

    public Set<Chair> getAll() {
        return new HashSet<>(chairRepository.findAll());
    }

    public Chair saveChair(Chair Chair) {
        return chairRepository.save(Chair);
    }
}
