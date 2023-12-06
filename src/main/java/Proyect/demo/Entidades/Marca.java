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
@Table(name = "Marca")
public class Marca extends Base{

    @Column(name = "nombreMarca")
    private String nombreMarca;
    @Column(name = "descripcionMarca")
    private String descripcionMarca;


}
