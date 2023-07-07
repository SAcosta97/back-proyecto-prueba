package com.Back.Datos.Entity;


import groovyjarjarantlr4.v4.runtime.misc.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "mantenimiento" , schema = "public")
public class MantenimientoEintity {

   @Id
   @Column(name = "id" ,nullable = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Nullable
   private Long id;

   @Column(name = "nombre")
   private  String nombre;

   @Column(name = "apellido")
    private String apellido;
   //Cambiar tipo de dato a Interger int


   @Column (name = "edad")
    private String edad;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public String getEdad() {
      return edad;
   }

   public void setEdad(String edad) {
      this.edad = edad;
   }
}
