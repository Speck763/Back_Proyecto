package Proyect.demo.DTOs;

import Proyect.demo.Entidades.Producto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoCategoriaDTO {
    private String nombreCategoria;
    private Producto producto;
}
