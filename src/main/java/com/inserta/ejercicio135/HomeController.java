package com.inserta.ejercicio135;

import com.inserta.ejercicio135.usuarios.models.Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@SessionAttribute(required = false) Usuario usuario){
        return usuario == null ? "pages/login" : "index";
    }
}
