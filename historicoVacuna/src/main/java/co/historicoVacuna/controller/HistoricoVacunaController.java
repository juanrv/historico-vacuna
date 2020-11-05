package co.historicoVacuna.controller;


import co.historicoVacuna.command.HistoricoVacunaCommand;
import co.historicoVacuna.fabrica.HistoricoVacunaFabrica;
import co.historicoVacuna.servicio.HistoricoVacunaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/historico")
public class HistoricoVacunaController {
    @Autowired
    private HistoricoVacunaServicio historicoVacunaServicio;
    @Autowired
    private HistoricoVacunaFabrica historicoVacunaFabrica;

    @GetMapping("/buscar/{id}")
    public HistoricoVacunaCommand findById(Long id){
        return historicoVacunaFabrica.entityToCommand(historicoVacunaServicio.findById(id));
    }
    @GetMapping("/listar")
    public List<HistoricoVacunaCommand> listarHistoricos(){
        return historicoVacunaServicio.listarHistoricos();
    }
    /*@GetMapping("/bucar-fecha")
    public List<HistoricoVacunaCommand> buscarPooFecha(Date fecha){
        return historicoVacunaServicio.buscarPorFecha(fecha);
    }*/
    @PostMapping("/registrar")
    public String registrarHistorico(@RequestBody HistoricoVacunaCommand historicoVacunaCommand){
        return historicoVacunaServicio.registrarHistorico(historicoVacunaCommand);
    }

}
