package Sistema.Ata.Sistema.Ata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Sistema.Ata.Sistema.Ata.model.Ata;
import Sistema.Ata.Sistema.Ata.repository.AtaRepository;

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