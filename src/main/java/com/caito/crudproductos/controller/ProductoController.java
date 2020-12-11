package com.caito.crudproductos.controller;

import com.caito.crudproductos.models.Producto;
import com.caito.crudproductos.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
@CrossOrigin
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/ver/{id}")
    public ResponseEntity<Producto> findOne(@PathVariable("id") String idProducto){

        Producto producto = productoService.IdProdructo(idProducto);

        return new ResponseEntity(producto, HttpStatus.OK);
    }


}
