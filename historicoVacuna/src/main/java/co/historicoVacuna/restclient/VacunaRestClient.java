package co.historicoVacuna.restclient;

import co.historicoVacuna.dto.VacunaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servicio.vacuna", url = "localhost:8082/vacuna")
public interface VacunaRestClient {
    @GetMapping("/buscar/{id}")
    VacunaDTO findById(Long id);
}
