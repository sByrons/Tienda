
package com.Tienda.dao;

import com.Tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long>{
   
    
}
