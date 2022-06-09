package com.portfolio.fv.Service;

import com.portfolio.fv.Entity.Experiencia;
import com.portfolio.fv.Repository.ExperienciaRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
    
    private final ExperienciaRepo experienciaRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;  
    }
    
    public Experiencia addExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }
    
    public List<Experiencia> buscarExperiencias() {
        return experienciaRepo.findAll();
    }
    public Experiencia editarExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }
    
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
    
}
