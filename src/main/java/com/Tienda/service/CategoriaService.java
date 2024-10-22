
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    
    public List<Categoria> getCategorias(boolean activos);
}
