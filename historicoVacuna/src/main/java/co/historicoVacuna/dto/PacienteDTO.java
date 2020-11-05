package co.historicoVacuna.dto;

import lombok.Data;

@Data
public class PacienteDTO {

    private Long idPaciente;
    private String nombre;
    private String especie;
    private String raza;
    private String nombreDueno;
    private Long telefono;
}