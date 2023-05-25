package com.inserta.ejercicio135.usuarios.services;


import com.inserta.ejercicio135.usuarios.models.Usuario;

public interface UserService{

    public Usuario usuarioValido(String correo, String clave);
}
