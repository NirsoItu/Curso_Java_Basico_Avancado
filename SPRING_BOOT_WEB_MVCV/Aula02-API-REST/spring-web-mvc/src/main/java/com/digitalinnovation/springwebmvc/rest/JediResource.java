package com.digitalinnovation.springwebmvc.rest;

import com.digitalinnovation.springwebmvc.model.Jedi;
import com.digitalinnovation.springwebmvc.service.JediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class JediResource {

    @Autowired
    private JediService service;

    // Buscar todos
    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi(){
        return service.findAll();
    }

    // Buscar por id
    @GetMapping("api/jedi/{id}")
    public ResponseEntity<Jedi> getJedi(@PathVariable("id") Long id) {
        final Jedi jedi = service.findById(id);
            return ResponseEntity.ok(jedi);
    }

    // Criar registro
    @PostMapping("/api/jedi")
    @ResponseStatus(HttpStatus.CREATED) // Retorna o codigo 201
    public Jedi createJedi(@Valid @RequestBody Jedi jedi) {
        return service.save(jedi);
    }

    // Alterar registro
    @PutMapping("/api/jedi/{id}")
    public ResponseEntity<Jedi> updateJedi(@PathVariable("id") Long id, @Valid @RequestBody Jedi dto) {

        final Jedi jedi = service.update(id, dto);
        return ResponseEntity.ok(jedi);
    }

    // Deletar registro
    @DeleteMapping("/api/jedi/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id){
       service.delete(id);
    }
}
