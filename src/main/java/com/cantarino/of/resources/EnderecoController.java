package com.cantarino.of.resources;

import com.cantarino.of.client.ViaCEPClient;
import com.cantarino.of.models.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

@RestController
public class EnderecoController {

    @Autowired
    private ViaCEPClient _via;

    @GetMapping("/endereco/{cep}")
    public ResponseEntity obterEnderecoCompleto(@PathVariable("cep") String cep) throws RestClientException {
        return ResponseEntity.ok(_via.buscaEnderecoPor(cep));
    }

    @GetMapping("/bairro/{cep}")
    public ResponseEntity obterBairoCompleto(@PathVariable("cep") String cep) throws RestClientException {

        Endereco endereco = _via.buscaBairroPor(cep);
        return ResponseEntity.ok(endereco.getBairro());
    }
}
