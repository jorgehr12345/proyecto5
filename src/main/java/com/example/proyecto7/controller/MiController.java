package com.example.proyecto7.controller;

import com.example.proyecto7.domain.Miembros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/miembros")
public class MiController {


   @PostMapping("/añad_miemb")
   public String añadir(){
      return "Añadir";
   }
   @PutMapping("/act_miemb")
   public String actualizar(){
      return "Actualizacion";
   }
   @DeleteMapping("/elim_miemb/{nombres}")
   public String eliminar(@PathVariable("nombres") String nombre){
      return "El nombre que se quiere eliminar es" + nombre;
   }
   @GetMapping("/list_miemb")
   public String listar(){
      return "Listar  miembros";
   }
}
