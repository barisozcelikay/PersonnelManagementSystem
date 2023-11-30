package com.bilgedam.personnel.management.sys.controller;

import com.bilgedam.personnel.management.sys.dto.RankModel;
import com.bilgedam.personnel.management.sys.entity.Rank;
import com.bilgedam.personnel.management.sys.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rank")
public class RankController {

    @Autowired
    RankService rankService;


    @GetMapping("/all")
    public ResponseEntity<List<RankModel>> getAll() {
        return ResponseEntity.ok().body(rankService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RankModel> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(rankService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<RankModel> create(@RequestBody RankModel model) {
        return ResponseEntity.ok().body(rankService.create(model));
    }

    @PutMapping()
    public ResponseEntity<RankModel> update(@RequestBody RankModel model) {
        return ResponseEntity.ok().body(rankService.update(model));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        rankService.delete(id);
        return ResponseEntity.ok().body("Rank with id : "+id.toString()+" Successfully deleted");
    }
}
