package com.portfolio.fv.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String middleName;
    private String apellido;
    private String domicilio;
    private String titulo;
    @Size(min = 1, max = 512, message = "no cumple con la longitud")
    private String descripcion;
    private String fotoPerfil;
    private String movilUsuario;
    private String mailUsuario;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private LocalDate fechaNacUsuario;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkills")
    private List<Skills>skillList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;
    
    public Usuario() {
        
    }

    public Usuario(Long id, String nombre, String middleName, String apellido, String domicilio, String titulo, String descripcion, String fotoPerfil, String movilUsuario, String mailUsuario, LocalDate fechaNacUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.middleName = middleName;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoPerfil = fotoPerfil;
        this.movilUsuario = movilUsuario;
        this.mailUsuario = mailUsuario;
        this.fechaNacUsuario = fechaNacUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getMovilUsuario() {
        return movilUsuario;
    }

    public void setMovilUsuario(String movilUsuario) {
        this.movilUsuario = movilUsuario;
    }

    public String getMailUsuario() {
        return mailUsuario;
    }

    public void setMailUsuario(String mailUsuario) {
        this.mailUsuario = mailUsuario;
    }

    public LocalDate getFechaNacUsuario() {
        return fechaNacUsuario;
    }

    public void setFechaNacUsuario(LocalDate fechaNacUsuario) {
        this.fechaNacUsuario = fechaNacUsuario;
    }
    
}
