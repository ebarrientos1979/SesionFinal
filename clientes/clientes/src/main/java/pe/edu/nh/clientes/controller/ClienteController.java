package pe.edu.nh.clientes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @RequestMapping("/listar")
    public String listar() {
        return "Listado de clientes";
    }

    @RequestMapping("/detalle")
    public String detalle() {
        return "Detalle del cliente";
    }

    @RequestMapping("/crear")
    public String crear() {
        return "Crear un cliente";
    }

    @RequestMapping("/editar")
    public String editar() {
        return "Editar un cliente";
    }

    @RequestMapping("/eliminar")
    public String eliminar() {
        return "Eliminar un cliente";
    }
}
