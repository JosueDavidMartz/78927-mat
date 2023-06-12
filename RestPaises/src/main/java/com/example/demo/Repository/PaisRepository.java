package com.example.demo.Repository;


import com.example.demo.Model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

//Proporciona métodos predefinidos para nuestras operaciones de acceso a la base de datos

public interface PaisRepository extends JpaRepository<Pais, Integer> {
    Pais findByNombre(String nombre);
}
