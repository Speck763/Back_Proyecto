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
@Table(name = "DetalleFactura")
public class DetalleFactura extends Base{

    @Column(name = "nroLinea")
    private int nroLinea;
    @Column(name = "subTotalLinea")
    private double subTotalLinea;
    @Column(name = "cantidadVentas")
    private Long cantidadVentas;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_producto")
    private Producto producto;
}
