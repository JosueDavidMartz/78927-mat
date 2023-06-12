package com.example.demo.Controller;
import com.example.demo.Model.Pais;
import com.example.demo.Repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PaisesController {

    @Autowired
    private PaisRepository paisRepository;

    @GetMapping(value = "/obtencionesTodos") //Devuelve solo paises con proyectos
    public List<Pais> getCountriesWithProjects() {
        List<Pais> paises = paisRepository.findAll();
        List<Pais> paisesConProyectos = new ArrayList<>();
        try {
            for (Pais pais : paises) {
                if (pais.getProyecto() != null && !pais.getProyecto().isEmpty()) {
                    paisesConProyectos.add(pais);
                }
            }

            return paisesConProyectos;
        } catch (Exception e) {
            return paisesConProyectos;
        }
    }

    @PostMapping(value = "agregacionesPaises") //Agregamos paises
    public String saveCountry(@RequestBody Pais pais) {
        try {
            paisRepository.save(pais);
            return "save pais";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al guardar el país";
        }
    }


    @PutMapping(value = "/modificaciones/{nombre}") //Modificamos el pais por nombre
    public String updateCountry(@PathVariable String nombre, @RequestBody Pais pais) {
        try {
            Pais updatePais = paisRepository.findByNombre(nombre);
            if (updatePais != null) {
                updatePais.setNombre(pais.getNombre());
                updatePais.setCapital(pais.getCapital());
                updatePais.setPoblacion(pais.getPoblacion());
                updatePais.setReligion(pais.getReligion());
                updatePais.setCultura(pais.getCultura());
                updatePais.setCodigoDePais(pais.getCodigoDePais());

                paisRepository.save(updatePais);
                return "update pais";
            } else {
                return "no se encontró el país";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al modificar el país";
        }
    }


    @DeleteMapping(value="eliminaciones/{nombre}") //Eliminamos el pais
    public String deleteCountry(@PathVariable String nombre) {
        try {
            Pais deletePais = paisRepository.findByNombre(nombre);
            if (deletePais != null) {
                paisRepository.delete(deletePais);
                return "delete pais";
            } else {
                return "no se encontró el país";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al eliminar el país";
        }
    }

}

