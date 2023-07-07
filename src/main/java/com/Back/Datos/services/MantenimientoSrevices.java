package com.Back.Datos.services;

import com.Back.Datos.Dto.MantenimitoDto;
import com.Back.Datos.Entity.MantenimientoEintity;
import com.Back.Datos.Repository.MantenimientoRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MantenimientoSrevices {
    
    
    @Autowired
   private  MantenimientoRepository mantenimientoRepository;



        public List<MantenimitoDto> consultaPersonalMant(String apellido){

        List<MantenimitoDto> lsExit = new ArrayList<>();
        
        List<MantenimientoEintity> lsMant= mantenimientoRepository.findByApellido(apellido);

            lsMant.forEach(x->{
              MantenimitoDto mant= new MantenimitoDto();
              mant.setId(x.getId());
              mant.setNombre(x.getNombre());
              mant.setApellido( x.getApellido());
              mant.setEdad(x.getEdad());
              lsExit.add(mant);

          });

        return  lsExit;
    }



}
