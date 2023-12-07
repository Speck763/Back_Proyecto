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
@Table(name = "InfoEnvio")

public class InfoEnvio extends Base{

    @Column(name = "costoEnvio")
    private double costoEnvio;
    @Enumerated(EnumType.ORDINAL)
    private TipoEnvio tipoEnvio;

    public enum TipoEnvio{
        EXPRESS,
        NORMAL
    }
}
