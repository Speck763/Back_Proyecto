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

}
