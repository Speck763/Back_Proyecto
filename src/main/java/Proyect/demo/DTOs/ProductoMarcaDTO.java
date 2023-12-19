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
public class ProductoMarcaDTO {
    private String nombreMarca;
    private Producto producto;

}
