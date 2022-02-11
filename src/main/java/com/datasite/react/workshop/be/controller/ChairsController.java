package com.datasite.react.workshop.be.controller;

import com.datasite.react.workshop.be.model.Chair;
import com.datasite.react.workshop.be.service.ChairService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/chairs")
public class ChairsController {

    private final ChairService ChairService;

    public ChairsController(ChairService ChairService) {
        this.ChairService = ChairService;
    }

    @GetMapping("/{id}")
    public Chair find(@PathVariable String id) {
        return ChairService.getChair(id);
    }

    @GetMapping()
    public Set<Chair> find() {
        return ChairService.getAll();
    }

    @PostMapping
    public Chair create(@RequestBody Chair Chair) {
        return ChairService.saveChair(Chair);
    }

    @PutMapping
    public Chair update(@RequestBody Chair Chair) {
        return ChairService.saveChair(Chair);
    }
}
