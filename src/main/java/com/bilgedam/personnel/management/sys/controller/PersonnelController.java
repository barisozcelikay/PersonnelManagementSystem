package com.bilgedam.personnel.management.sys.controller;

import com.bilgedam.personnel.management.sys.dto.PersonnelModel;
import com.bilgedam.personnel.management.sys.service.PersonnelService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/personnel")
public class PersonnelController {

    @Autowired
    PersonnelService personnelService;

    @GetMapping("/all")
    public ResponseEntity<List<PersonnelModel>> getAll() {
        return ResponseEntity.ok().body(this.personnelService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonnelModel> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.personnelService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<PersonnelModel> create(@Validated @RequestBody PersonnelModel model) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.personnelService.create(model));
    }

    @PutMapping()
    public ResponseEntity<PersonnelModel> update(@Validated @RequestBody PersonnelModel model) {
        return ResponseEntity.ok().body(this.personnelService.update(model));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        this.personnelService.delete(id);
        return ResponseEntity.ok().body("Personnel with id : "+id.toString()+" Successfully deleted");
    }
}
