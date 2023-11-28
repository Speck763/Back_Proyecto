package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

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
}
