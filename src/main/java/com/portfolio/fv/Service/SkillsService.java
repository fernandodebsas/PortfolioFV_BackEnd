package com.portfolio.fv.Service;

import com.portfolio.fv.Entity.Skills;
import com.portfolio.fv.Repository.SkillsRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;  
    }
    
    public Skills addSkill(Skills skills) {
        return skillsRepo.save(skills);
    }
    
    public List<Skills> buscarSkills() {
        return skillsRepo.findAll();
    }
    public Skills editarSkill(Skills skills) {
        return skillsRepo.save(skills);
    }
    
    public void borrarSkill(Long id){
        skillsRepo.deleteById(id);
    }
    
}
