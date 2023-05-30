package com.piso.pisoapp.pisoapp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.piso.pisoapp.pisoapp.modelo.Solicitud;

import java.util.List;

@Repository public interface RepositorioNecesidades extends JpaRepository<Solicitud, Integer > {



    List<Solicitud> findByFinalizadoFalse();
    List<Solicitud> findByFinalizadoTrue();

    List<Solicitud> findTop1OByOrderByIdSolicitudDesc();
}
