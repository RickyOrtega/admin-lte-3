package org.rickyortega.adminlte3.models.dao;

import org.rickyortega.adminlte3.models.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpresaDao extends JpaRepository<Empresa,Long> {

}
