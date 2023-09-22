package org.rickyortega.adminlte3.models.dao;

import org.rickyortega.adminlte3.models.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaDao extends JpaRepository<Categoria,Long> {

}
