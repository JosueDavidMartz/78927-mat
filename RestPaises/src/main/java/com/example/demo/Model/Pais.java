package com.example.demo.Model;
import javax.persistence.*;

@Entity
@Table(schema = "PaisCrud")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String capital;
    @Column
    private int poblacion;
    @Column
    private String religion;
    @Column
    private String cultura;
    @Column
    private String codigoDePais;
    @Column
    private String proyecto;

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public String getCodigoDePais() {
        return codigoDePais;
    }

    public void setCodigoDePais(String codigoDePais) {
        this.codigoDePais = codigoDePais;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public int getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    public String getReligion() {
        return religion;
    }
    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getProyecto() {
        return proyecto;
    }
    public void setProyecto(String proyect) {
        this.proyecto = proyect;
    }

}
