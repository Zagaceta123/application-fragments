package pe.edu.cibertec.appwebfragments.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.appwebfragments.controller.HomeController;
@Controller
@RequestMapping
public class HomeController {




        @GetMapping("/home")
        public String index(Model model){
            return "home";

        }
}
