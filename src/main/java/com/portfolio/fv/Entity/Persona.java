
package com.portfolio.fv.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
@Entity
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String apellido;
    
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String domicilio;
    
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String fechaNac;
    
    @Size(min = 1, max = 12, message = "no cumple con la longitud")
    private String telefono;
    
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String correo;
    
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String sobreMi;
    
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String urlFoto;
    
}