package com.piso.pisoapp.pisoapp.repositorio;

import com.piso.pisoapp.pisoapp.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuarios extends JpaRepository<Usuario, Integer> {


}
