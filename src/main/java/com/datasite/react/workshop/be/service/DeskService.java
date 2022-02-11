package com.datasite.react.workshop.be.service;

import com.datasite.react.workshop.be.model.Desk;
import com.datasite.react.workshop.be.repository.DeskRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DeskService {

    private final DeskRepository deskRepository;

    public DeskService(DeskRepository deskRepository) {
        this.deskRepository = deskRepository;
    }

    public Desk getDesk(String id) {
        return deskRepository.findById(id).orElseThrow(() -> new RuntimeException("No desk found with id="+id));
    }

    public Set<Desk> getAll() {
        return new HashSet<>(deskRepository.findAll());
    }

    public Desk saveDesk(Desk desk) {
        return deskRepository.save(desk);
    }
}
