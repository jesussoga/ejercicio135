package com.inserta.ejercicio135.usuarios.services;

import com.inserta.ejercicio135.usuarios.models.Usuario;
import com.inserta.ejercicio135.usuarios.repository.UsuarioRepo;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UserService{
    private final UsuarioRepo usuarioRepo;

    public UsuarioServiceImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public Usuario usuarioValido(String correo, String clave) {
        return this.usuarioRepo.findByCorreoAndClave(correo, clave);
    }
}
