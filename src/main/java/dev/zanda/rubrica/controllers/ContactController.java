package dev.zanda.rubrica.controllers;

import dev.zanda.rubrica.models.Contatto;
import dev.zanda.rubrica.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rubrica")
public class ContactController {


    @Autowired
    private ContactService contactService;

    @GetMapping
    public ResponseEntity<List<Contatto>> getAll() {
        return ResponseEntity.ok(contactService.getAllService());
    }

    @GetMapping("/firstName/{first}")
    public ResponseEntity<List<Contatto>> getAllByFirstName(@PathVariable String first) {
        return ResponseEntity.ok(contactService.getContactByFirstName(first));
    }

    @GetMapping("/lastName/{last}")
    public ResponseEntity<List<Contatto>> getAllByLasttName(@PathVariable String last) {
        return ResponseEntity.ok(contactService.getContactByFirstName(last));
    }

    @DeleteMapping("/{varId}")
    public ResponseEntity<Void> delete(@PathVariable int varId) {
        contactService.deleteById(varId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Contatto> saveContact(@RequestBody Contatto contatto) {
        return ResponseEntity.ok(contactService.save(contatto));
    }

    @PutMapping("{id}")
    public ResponseEntity<Contatto> update(@PathVariable int id,
                                           @RequestBody Contatto contatto) {
        return ResponseEntity.ok(contactService.update(id, contatto));
    }




}
