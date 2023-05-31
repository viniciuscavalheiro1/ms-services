package br.com.vinicius.service;

import br.com.vinicius.model.Cambio;
import br.com.vinicius.repository.CambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CambioService  {

    @Autowired
    private CambioRepository cambioRepository;

    public Cambio GetCambio(String from, String to) {
        return cambioRepository.findByFromAndTo(from, to);
    }
}
