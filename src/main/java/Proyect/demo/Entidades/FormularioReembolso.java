package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "FormularioReembolso")
public class FormularioReembolso extends Base{

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_formularioReembolso")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_formularioReembolso")
    private Pedido pedido;
}
