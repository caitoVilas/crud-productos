package com.caito.crudproductos.services.impl;

import com.caito.crudproductos.models.Producto;
import com.caito.crudproductos.repository.ProductoRepository;
import com.caito.crudproductos.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ProductoService")
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto IdProdructo(String idProducto) {

        Producto producto = null;

        try {
            producto = productoRepository.findById(idProducto);
        }catch (Exception e){}

        return producto;
    }
}
