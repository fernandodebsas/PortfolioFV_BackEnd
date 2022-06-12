package com.portfolio.fv.Controller;

import com.portfolio.fv.Entity.Skills;
import com.portfolio.fv.Service.SkillsService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/skills")
public class SkillsController {
    
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }
    
    @PutMapping("/update")
    public ResponseEntity<Skills> editarSkill(@RequestBody Skills skill) {
        Skills updateSkills = skillsService.editarSkill(skill);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Skills>> obtenerSkills() {
        List<Skills> skills = skillsService.buscarSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Skills> crearSkill(@RequestBody Skills skill) {
        Skills nuevaSkills = skillsService.addSkill(skill);
        return new ResponseEntity<>(nuevaSkills, HttpStatus.CREATED);
    }
    
     @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSkill(@PathVariable("id") Long id) {
        skillsService.borrarSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
} 
