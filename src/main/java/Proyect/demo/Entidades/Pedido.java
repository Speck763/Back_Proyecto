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
@Table(name = "Pedido")

public class Pedido extends Base{

    @Column(name = "fechaPedido")
    private Date fechaPedido;
    @Column(name = "totalPedido")
    private double totalPedido;
    @Enumerated(EnumType.STRING)
    private EstadoPedido estadoPedido;

    public enum EstadoPedido{
        PAGADO,
        PROCESANDO,
        CANCELADO,
        REEMBOLSADO
    }


    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_pedidoProducto")
    private PedidoProducto pedidoProducto;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_factura")
    private Factura factura;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_infoEnvio")
    private InfoEnvio infoEnvio;
}
