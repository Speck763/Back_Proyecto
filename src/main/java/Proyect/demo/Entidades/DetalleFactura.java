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
@Table(name = "DetalleFactura")
public class DetalleFactura extends Base{

    @Column(name = "nroLinea")
    private int nroLinea;
    @Column(name = "subTotalLinea")
    private double subTotalLinea;
}
