package co.vacunaController.controller;

import co.vacunaController.command.VacunaCommand;
import co.vacunaController.entity.VacunaEntity;
import co.vacunaController.servicio.VacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacuna")
public class VacunaController{
    @Autowired
    private VacunaService vacunaService;

    @PostMapping("/registro")
    public String registrarIngreso(@RequestBody VacunaCommand vacunaCommand){
        return vacunaService.registrarVacuna(vacunaCommand);
    }
    @GetMapping("/listar")
    public List<VacunaCommand> listarVacunas(){
        return vacunaService.listarVacunas();
    }

    @GetMapping("/buscar/{id}")
    public VacunaEntity findById(@PathVariable Long id){
        return vacunaService.findById(id);
    }
}