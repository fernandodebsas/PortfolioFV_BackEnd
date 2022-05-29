package com.portfolio.fv.Controller;

import com.portfolio.fv.Entity.Persona;
import com.portfolio.fv.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfoliofv.firebaseapp.com/iniciar-sesion")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    @ResponseBody
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente.";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente.";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido") String nuevoApellido,
                                @RequestParam("domicilio") String nuevoDomicilio,
                                @RequestParam("fechaNac") String nuevoFechaNac,
                                @RequestParam("telefono") String nuevoTelefono,
                                @RequestParam("correo") String nuevoCorreo,
                                @RequestParam("sobreMi") String nuevoSobreMi,
                                @RequestParam("urlFoto") String nuevoUrlFoto) {
        Persona persona = ipersonaService.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setDomicilio(nuevoDomicilio);
        persona.setFechaNac(nuevoFechaNac);
        persona.setTelefono(nuevoTelefono);
        persona.setCorreo(nuevoCorreo);
        persona.setSobreMi(nuevoSobreMi);
        persona.setUrlFoto(nuevoUrlFoto);
        
        ipersonaService.savePersona(persona);
        return persona;
        
    }
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }
    
}
