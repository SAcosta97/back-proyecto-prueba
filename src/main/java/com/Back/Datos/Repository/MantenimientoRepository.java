package com.Back.Datos.Repository;

import com.Back.Datos.Entity.MantenimientoEintity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MantenimientoRepository extends JpaRepository<MantenimientoEintity, Long> {


    List<MantenimientoEintity> findByApellido (String apellido);



}
