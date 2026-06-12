package io.github.eliaspinheiropereira.api_homefinance.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradouro;
    private String cep;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
