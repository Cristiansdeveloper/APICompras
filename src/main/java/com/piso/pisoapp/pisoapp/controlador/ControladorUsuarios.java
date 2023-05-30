package com.piso.pisoapp.pisoapp.controlador;

import com.piso.pisoapp.pisoapp.modelo.Usuario;
import com.piso.pisoapp.pisoapp.repositorio.RepositorioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class ControladorUsuarios {

    @Autowired
    private RepositorioUsuarios repo;


    @GetMapping
    public List<Usuario> getUsuarios(){
        return repo.findAll();
    }


}
