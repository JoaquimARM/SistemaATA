package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Ata;
import repository.AtaRepository;

@Service
public class AtaService {
    @Autowired
    private AtaRepository ataRepository;

    public Ata salvar(Ata ata) {
        return ataRepository.save(ata);
    }

    public List<Ata> listarAtas() {
        return ataRepository.findAll();
    }
}