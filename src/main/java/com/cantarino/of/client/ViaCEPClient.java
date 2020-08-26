package com.cantarino.of.client;

import com.cantarino.of.models.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://viacep.com.br/ws/"  , name = "viacep")
public interface ViaCEPClient {

    @GetMapping("/{cep}/json")
    Endereco buscaEnderecoPor(@PathVariable("cep") String cep);


    @GetMapping("/{cep}/json")
    Endereco buscaBairroPor(@PathVariable("cep") String cep);
}
