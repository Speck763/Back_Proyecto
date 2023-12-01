package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    @ManyToOne(cascade = CascadeType.ALL, optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_pedidoProducto")
    private Pedido pedido;
}
