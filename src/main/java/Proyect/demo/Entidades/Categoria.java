package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Table(name = "Categoria")
public class Categoria extends Base{

    @Column(name = "nombreCategoria")
    private String nombreCaegoria;

    private String imagen;

    @OneToMany(mappedBy = "fk_producto")
    private List<Producto> productos;
}
