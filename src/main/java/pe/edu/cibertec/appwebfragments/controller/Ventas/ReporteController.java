package pe.edu.cibertec.appwebfragments.controller.Ventas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Ventas/reporte")
public class ReporteController {
    @GetMapping("/registrarreporte")
    public String registrarReporte(){
        return "Ventas/reporte";
    }
}