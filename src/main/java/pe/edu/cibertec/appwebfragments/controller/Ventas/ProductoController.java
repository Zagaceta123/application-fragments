package pe.edu.cibertec.appwebfragments.controller.Ventas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Ventas/producto")
public class ProductoController {
    @GetMapping("/registrar")
    public String registrarProducto(){
        return "Ventas/producto";
    }
}
