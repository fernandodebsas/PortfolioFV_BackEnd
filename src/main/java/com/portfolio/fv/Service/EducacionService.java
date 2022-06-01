package com.portfolio.fv.Service;

import com.portfolio.fv.Entity.Educacion;
import com.portfolio.fv.Repository.EducacionRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;  
    }
    
    public Educacion addEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }
    
    public List<Educacion> buscarEducaciones() {
        return educacionRepo.findAll();
    }
    public Educacion editarEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
    
}
