package com.caito.crudproductos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "productos")
public class Producto implements Serializable {

    @MongoId(value = FieldType.OBJECT_ID)
    private String id;
    private String nombre;
    private String descripcion;
    private String marca;
    private Double precio;
    private Integer cantidad;
    private String rubro;

    private static  final long serialVersionUID = 1l;


}
