package com.tienda.dao;

import com.tienda.domain.Categoria;
import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface CategoriaDao extends JpaRepository <Categoria,Long>{

}
