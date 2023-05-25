package com.inserta.ejercicio135.usuarios.controllers;

import com.inserta.ejercicio135.usuarios.models.Usuario;
import com.inserta.ejercicio135.usuarios.services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public String validar(
            @RequestParam String correo,
            @RequestParam String clave,
            HttpSession session,
            Model model
    ){
        Usuario usuario = userService.usuarioValido(correo, clave);
        if (usuario != null){
            session.setAttribute("usuario", usuario);
            return "index";
        } else {
            model.addAttribute("credencialesNoValidas", true);
            return "pages/login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
