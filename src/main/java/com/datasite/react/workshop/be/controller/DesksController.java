package com.datasite.react.workshop.be.controller;

import com.datasite.react.workshop.be.model.Desk;
import com.datasite.react.workshop.be.service.DeskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/desks")
public class DesksController {

    private final DeskService deskService;

    public DesksController(DeskService deskService) {
        this.deskService = deskService;
    }

    @GetMapping("/{id}")
    public Desk find(@PathVariable String id) {
        return deskService.getDesk(id);
    }

    @GetMapping()
    public Set<Desk> find() {
        return deskService.getAll();
    }

    @PostMapping
    public Desk create(@RequestBody Desk desk) {
        return deskService.saveDesk(desk);
    }

    @PutMapping
    public Desk update(@RequestBody Desk desk) {
        return deskService.saveDesk(desk);
    }
}
