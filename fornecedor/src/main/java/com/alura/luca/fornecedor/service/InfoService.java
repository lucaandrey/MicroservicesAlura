package com.alura.luca.fornecedor.service;

import com.alura.luca.fornecedor.model.InfoFornecedor;
import com.alura.luca.fornecedor.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;
    public InfoFornecedor getInfoPorEstado(String estado) {

        return infoRepository.findByEstado(estado);

    }
}
