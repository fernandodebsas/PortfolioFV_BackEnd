package com.portfolio.fv.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkills;
    private String nombreSkill;
    private String fotoSkill;
    private int porcentaje;
    private boolean isHardSkill;
    
    public Skills() {
        
    }

    public Skills(Long idSkills, String nombreSkill, String fotoSkill, int porcentaje, boolean isHardSkill) {
        this.idSkills = idSkills;
        this.nombreSkill = nombreSkill;
        this.fotoSkill = fotoSkill;
        this.porcentaje = porcentaje;
        this.isHardSkill = isHardSkill;
    }

    public Long getIdSkills() {
        return idSkills;
    }

    public void setIdSkills(Long idSkills) {
        this.idSkills = idSkills;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getFotoSkill() {
        return fotoSkill;
    }

    public void setFotoSkill(String fotoSkill) {
        this.fotoSkill = fotoSkill;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public boolean getIsHardSkill() {
        return isHardSkill;
    }

    public void setIsHardSkill(boolean isHardSkill) {
        this.isHardSkill = isHardSkill;
    }

    
    
    
    
    
    
}
