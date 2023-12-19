package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Productos")
public class Producto extends Base{

    @Column(name = "fotoProducto")
    private String fotoProducto;
    @Column(name = "nombreProducto")
    private String nombreProducto;
    @Column(name = "precioCompra")
    private double precioCompra;
    @Column(name = "precioVenta")
    private double precioVenta;
    @Column(name = "stock")
    private int stock;
    @Column(name = "fechaAlta")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @Column(name = "fechaBaja")
    @Temporal(TemporalType.DATE)
    private Date fechaBaja;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "fk_marca")
    private Marca marca;
}
