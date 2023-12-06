package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = false)
    @JoinColumn(name = "fk_domicilio")
    private List<Domicilio> domicilios = new ArrayList<Domicilio>();
}
