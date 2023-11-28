package Proyect.demo.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "PedidoProductos")
public class PedidoProducto extends Base{

    @Column(name = "cantidadProducto")
    private int cantidadProducto;
    @Column(name = "subTotalLinea")
    private double subTotalLinea;
}
