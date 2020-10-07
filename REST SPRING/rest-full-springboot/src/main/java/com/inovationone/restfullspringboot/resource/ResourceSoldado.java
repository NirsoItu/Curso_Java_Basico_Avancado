package com.inovationone.restfullspringboot.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inovationone.restfullspringboot.controller.SoldadoController;
import com.inovationone.restfullspringboot.controller.response.SoldadoListResponse;
import com.inovationone.restfullspringboot.controller.response.SoldadoResponse;
import com.inovationone.restfullspringboot.entity.SoldadoEntity;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ResourceSoldado {

    private ObjectMapper objectMapper;

    public ResourceSoldado(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }

    public SoldadoListResponse criarLink(SoldadoEntity soldadoEntity){
        SoldadoListResponse soldadoListResponse = objectMapper.convertValue(soldadoEntity, SoldadoListResponse.class);
        Link link = linkTo(methodOn(SoldadoController.class).buscarSoldado(soldadoEntity.getId())).withSelfRel();
        soldadoListResponse.add(link);
        return soldadoListResponse;
    }

    // Criar link de detalhes e regras de negocio
    public SoldadoResponse criarLinkRegra(SoldadoEntity soldadoEntity){
        SoldadoResponse soldadoResponse = objectMapper.convertValue(soldadoEntity, SoldadoResponse.class);
        if(soldadoEntity.getStatus().equals("Morto")){
            Link link = linkTo(methodOn(SoldadoController.class).deletarSoldado(soldadoEntity.getId()))
                    .withRel("Remover")
                    .withTitle("Deletar irmão")
                    .withType("delete");
            soldadoResponse.add(link);
        }else if(soldadoEntity.getStatus().equals("Vivo")){
            Link link = linkTo(methodOn(SoldadoController.class).continuarOracao(soldadoEntity.getId()))
                    .withRel("Continuar")
                    .withTitle("Continuar a batalha contra o pecado")
                    .withType("put");
            soldadoResponse.add(link);
        }
        return soldadoResponse;
    }
}
