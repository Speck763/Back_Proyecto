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

@Table(name = "Categoria")
public class Categoria extends Base{

    @Column(name = "nombreCategoria")
    private String nombreCategoria;
    @Column(name ="descripcionCategoria")
    private String descripcionCategoria;
    @Column(name="imagenCategoria")
    private String imagenCategoria;
}
