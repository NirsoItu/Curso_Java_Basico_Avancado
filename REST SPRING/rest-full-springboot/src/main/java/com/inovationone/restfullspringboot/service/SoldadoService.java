package com.inovationone.restfullspringboot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inovationone.restfullspringboot.controller.request.SoldadoEditRequest;
import com.inovationone.restfullspringboot.controller.response.SoldadoListResponse;
import com.inovationone.restfullspringboot.controller.response.SoldadoResponse;
import com.inovationone.restfullspringboot.dto.Soldado;
import com.inovationone.restfullspringboot.entity.SoldadoEntity;
import com.inovationone.restfullspringboot.repository.SoldadoRepository;
import com.inovationone.restfullspringboot.resource.ResourceSoldado;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SoldadoService {

    private SoldadoRepository soldadoRepository;
    private ObjectMapper objectMapper;
    private ResourceSoldado resourceSoldado;


    public SoldadoService(SoldadoRepository soldadoRepository, ObjectMapper objectMapper, ResourceSoldado resourceSoldado){
        this.soldadoRepository = soldadoRepository;
        this.objectMapper = objectMapper;
        this.resourceSoldado = resourceSoldado;
    }

    public SoldadoResponse buscarSoldado(Long id){
        SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow();
        //Criar um link dentro do link da entidade
        SoldadoResponse soldadoResponse = resourceSoldado.criarLinkRegra(soldado);
        return soldadoResponse;
    }

    public void criarSoldado(Soldado soldado){
        SoldadoEntity soldadoEntity = objectMapper.convertValue(soldado, SoldadoEntity.class);
        soldadoRepository.save(soldadoEntity);
    }

    public void alterarSoldado(Long id, SoldadoEditRequest soldadoEditRequest) {
        SoldadoEntity soldadoEntity = objectMapper.convertValue(soldadoEditRequest, SoldadoEntity.class);
        soldadoEntity.setId(id);
        soldadoRepository.save(soldadoEntity);
    }

    public void deletarSoldado(Long id) {
        SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow();
        soldadoRepository.delete(soldado);
    }

    public List<SoldadoListResponse> buscarTodosSoldados(){
        List<SoldadoEntity> all = soldadoRepository.findAll();
        List<SoldadoListResponse> soldadoStream = all.stream()
                .map(it -> resourceSoldado.criarLink(it))
                .collect(Collectors.toList());
        return soldadoStream;
    }
}
