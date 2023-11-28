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
@Table(name = "Localidad")

public class Localidad extends Base{

    @Column(name = "nombreLocalidad")
    private String nombreLocalidad;
    @Column(name = "codPostal")
    private String codPostal;
}
