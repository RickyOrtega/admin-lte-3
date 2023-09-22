package org.rickyortega.adminlte3.models.service;

import org.rickyortega.adminlte3.models.dao.ICategoriaDao;
import org.rickyortega.adminlte3.models.dao.IEmpresaDao;
import org.rickyortega.adminlte3.models.entity.Categoria;
import org.rickyortega.adminlte3.models.entity.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private ICategoriaDao categoriaDao;

    @Override
    public Categoria create(Categoria categoria) {
        return null;
    }

    @Override
    public List<Categoria> findAll() {
        return null;
    }

    @Override
    public Categoria findById(Long id) {
        //Este método devuelve un objeto de tipo Optional, por lo que se debe usar el método orElse(null) para que devuelva un objeto de tipo Categoria
        return categoriaDao.findById(id).orElse(null);
    }

    @Override
    public Categoria update(Categoria categoria) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}