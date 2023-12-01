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
@Table(name = "Localidad")

public class Localidad extends Base{

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "codPostal")
    private String codPostal;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = false)
    @JoinColumn(name = "fk_localidad")
    private Domicilio domicilio;
}
