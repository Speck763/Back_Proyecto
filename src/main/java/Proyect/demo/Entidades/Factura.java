package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Factura")

public class Factura extends Base{

    @Column(name = "descuentoFactura")
    private int descuentoFactura;
    @Column(name = "fechaFactura")
    private Date fechaFactura;
    @Column(name = "totalFactura")
    private double totalFactura;
    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;

    public enum FormaPago {
        PAYPAL,
        MASTERCARD,
        VISA
    }

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "pk_detalleFactura1")
    private List<DetalleFactura> detalleFactura = new ArrayList<DetalleFactura>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_pedido")
    private Pedido pedido;

    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;
}
