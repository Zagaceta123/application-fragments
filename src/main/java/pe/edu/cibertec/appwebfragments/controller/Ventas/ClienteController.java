package pe.edu.cibertec.appwebfragments.controller.Ventas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Ventas/cliente")
public class ClienteController {
    @GetMapping("/registrarcliente")
    public String registrarCliente(){
        return "Ventas/cliente";
    }
}
