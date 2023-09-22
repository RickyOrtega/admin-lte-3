package org.rickyortega.adminlte3.models.service;

import org.rickyortega.adminlte3.models.dao.IEmpresaDao;
import org.rickyortega.adminlte3.models.entity.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl implements IEmpresaService{

    @Autowired
    private IEmpresaDao empresaDao;

    @Override
    public Empresa create(Empresa empresa) {
        return null;
    }

    @Override
    public List<Empresa> findAll() {
        return empresaDao.findAll();
    }

    @Override
    public Empresa findById(Long id) {
        //Este método devuelve un objeto de tipo Optional, por lo que se debe usar el método orElse(null) para que devuelva un objeto de tipo Empresa
        return empresaDao.findById(id).orElse(null);
    }

    @Override
    public Empresa update(Empresa empresa) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}