package com.example.Taller03_SueldoTrabajador.controller;
import com.example.Taller03_SueldoTrabajador.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoController {
    // Ruta para mostrar el formulario
    @GetMapping("/formulario_empleado")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "formulario_empleado";
    }

    // Ruta para manejar el formulario y mostrar el resultado
    @PostMapping("/resultado_empleado")
    public String calcularSueldo(Empleado empleado, Model model) {
        model.addAttribute("empleado", empleado);
        model.addAttribute("sueldoTotal", empleado.calcularSueldoTotal());
        return "resultado_empleado";
    }
}
