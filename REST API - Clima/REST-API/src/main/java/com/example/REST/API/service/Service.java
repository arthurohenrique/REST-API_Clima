package com.example.REST.API.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class Service {

    public String preverTempo() {
        String dadosTempo = "";
        String apiURL = "http://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=dd0501f0bc4d671fb6e14f29d437e6d8";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()){
            dadosTempo = responseEntity.getBody();
        }
        else {
            dadosTempo = "Falha" + responseEntity.getStatusCode();
        }

        return dadosTempo;



    }
}
