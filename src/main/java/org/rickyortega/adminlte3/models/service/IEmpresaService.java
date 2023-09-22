package org.rickyortega.adminlte3.models.service;

import org.rickyortega.adminlte3.models.entity.Empresa;

import java.util.List;

public interface IEmpresaService {
    public Empresa create(Empresa empresa);

    public List<Empresa> findAll();

    public Empresa findById(Long id);

    public Empresa update(Empresa empresa);

    public void remove(Long id);
}
