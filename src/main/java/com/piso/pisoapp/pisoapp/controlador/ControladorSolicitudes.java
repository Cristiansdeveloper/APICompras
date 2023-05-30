package com.piso.pisoapp.pisoapp.controlador;
import com.piso.pisoapp.pisoapp.modelo.Solicitud;
import com.piso.pisoapp.pisoapp.modelo.Usuario;
import com.piso.pisoapp.pisoapp.repositorio.RepositorioNecesidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ControladorSolicitudes {

    @Autowired
    private RepositorioNecesidades repositorio;

    @GetMapping
    public List<Solicitud> getSolicitudes(){
        return repositorio.findByFinalizadoFalse();
    }

    @GetMapping("/comprados")
    public List<Solicitud> getSolicitudeFinalizadas(){
        return repositorio.findByFinalizadoTrue();
    }

    @PostMapping (consumes = "application/json")
    public void postSolicitud(@RequestBody Solicitud s){
         repositorio.save(s);
    }


    @PutMapping(consumes = "application/json")
    public void cambiarSolicitud(@RequestBody Solicitud s){
        repositorio.save(s);

    }

    @GetMapping("/mayorId")
    public List<Solicitud> getHigherUsuario(){
        return repositorio.findTop1OByOrderByIdSolicitudDesc();
    }

}
