package com.dio.live.Service;

import com.dio.live.Repository.JornadaRepository;
import com.dio.live.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return  jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long id) throws Exception {
        return jornadaRepository.findById(id);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return  jornadaRepository.save(jornadaTrabalho);
    }

    public boolean delete(Long id){
        JornadaTrabalho jornadaTrabalho = jornadaRepository.findById(id).orElseThrow();
        jornadaRepository.delete(jornadaTrabalho);
        return jornadaRepository.existsById(id);
    }

}
