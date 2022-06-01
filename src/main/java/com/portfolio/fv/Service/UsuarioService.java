package com.portfolio.fv.Service;

import com.portfolio.fv.Entity.Usuario;
import com.portfolio.fv.Repository.UsuarioRepo;
import com.portfolio.fv.exception.UserNotFoundException;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;  
    
    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }
    
    public Usuario addUser(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
    
    public List<Usuario> buscarUsuario() {
        return usuarioRepo.findAll();
    }
    
    public Usuario editarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
    
    public void borrarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }
    
    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioRepo.findById(id).orElseThrow(() ->new UserNotFoundException("usuario no encontrado"));
    }
    
}
