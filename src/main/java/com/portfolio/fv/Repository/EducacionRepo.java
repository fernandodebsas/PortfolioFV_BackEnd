/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.fv.Repository;

import com.portfolio.fv.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fernandovazquez
 */
public interface EducacionRepo extends JpaRepository<Educacion,Long> {
    
}