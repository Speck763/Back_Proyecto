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
@Table(name = "Doicilio")

public class Domicilio extends Base{

    @Column(name = "calle")
    private String calle;
    @Column(name = "nroCasa")
    private String nroCasa;

}
