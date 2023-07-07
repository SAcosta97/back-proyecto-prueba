package com.Back.Datos.Controller;

import com.Back.Datos.Dto.MantenimitoDto;
import com.Back.Datos.services.MantenimientoSrevices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Mantenimiento/")
public class ManteniminetoController {

        @Autowired
        private MantenimientoSrevices mantenimientoSrevices;


    @GetMapping("consultaApellido/")
    public List<MantenimitoDto> consultApellido(@RequestParam String apellido ){
        return mantenimientoSrevices.consultaPersonalMant(apellido);


    }




}
