package com.inovationone.restfullspringboot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inovationone.restfullspringboot.controller.request.SoldadoEditRequest;
import com.inovationone.restfullspringboot.controller.response.SoldadoListResponse;
import com.inovationone.restfullspringboot.controller.response.SoldadoResponse;
import com.inovationone.restfullspringboot.dto.Soldado;
import com.inovationone.restfullspringboot.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private SoldadoService soldadoService;
    private ObjectMapper objectMapper;

    public SoldadoController(SoldadoService soldadoService, ObjectMapper objectMapper){
        this.soldadoService = soldadoService;
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public ResponseEntity<List<SoldadoListResponse>> buscarTodosSoldados(){
        List<SoldadoListResponse> soldadoListResponses = soldadoService.buscarTodosSoldados();
        return ResponseEntity.status(HttpStatus.OK).body(soldadoListResponses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SoldadoResponse> buscarSoldado(@PathVariable() Long id){
        SoldadoResponse soldadoResponse = soldadoService.buscarSoldado(id);
        return ResponseEntity.status(HttpStatus.OK).body(soldadoResponse);
    }

    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody Soldado soldado){
        soldadoService.criarSoldado(soldado);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity editarSoldado(@PathVariable() Long id,
                                                 @RequestBody SoldadoEditRequest soldadoEditRequest){

        soldadoService.alterarSoldado(id, soldadoEditRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/continuar-a-oracao/{id}")
    public ResponseEntity continuarOracao(@PathVariable() Long id){
        //FAZER ALGO
        //soldadoService.alterarSoldado(id, soldadoEditRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarSoldado(@PathVariable() Long id){
        soldadoService.deletarSoldado(id);
        return ResponseEntity.ok().build();
    }
}
