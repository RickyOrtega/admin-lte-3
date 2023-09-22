package org.rickyortega.adminlte3.models.service;

import org.rickyortega.adminlte3.models.entity.Categoria;
import org.rickyortega.adminlte3.models.entity.Empresa;

import java.util.List;

public interface ICategoriaService {
    public Categoria create(Categoria categoria);

    public List<Categoria> findAll();

    public Categoria findById(Long id);

    public Categoria update(Categoria categoria);

    public void remove(Long id);
}
