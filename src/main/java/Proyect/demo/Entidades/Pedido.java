package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_pedidoProducto")
    private List<PedidoProducto> pedidoProductos = new ArrayList<PedidoProducto>();
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_infoEnvio")
    private InfoEnvio infoEnvio;
}
