package pe.edu.nh.productos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productos")
public class ProductosController {

        @RequestMapping("/listar")
        public String listar() {
            return "Listado de productos";
        }

        @RequestMapping("/detalle")
        public String detalle() {
            return "Detalle del producto";
        }

        @RequestMapping("/crear")
        public String crear() {
            return "Crear un producto";
        }

        @RequestMapping("/editar")
        public String editar() {
            return "Editar un producto";
        }

        @RequestMapping("/eliminar")
        public String eliminar() {
            return "Eliminar un producto";
        }
}
