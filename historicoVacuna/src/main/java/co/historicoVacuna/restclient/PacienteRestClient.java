package co.historicoVacuna.restclient;

import co.historicoVacuna.dto.PacienteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servicio.paciente", url = "localhost:8081/pacientes")
public interface PacienteRestClient {
    @GetMapping("/buscar/{id}")
    PacienteDTO findById(Long id);
}
