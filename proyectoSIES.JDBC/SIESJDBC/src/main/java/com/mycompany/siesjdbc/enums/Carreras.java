
package com.mycompany.siesjdbc.enums;


public enum Carreras {
    MATEMATICAS("Matematicas"), LENGUAJES("Lenguajes"), ARQUITECTURA("Arquitectura"), CIENCIAS("Ciencias"), DERECHO("Derecho"), PROGRAMACION("Programacion");

    public String departamento;

    Carreras(String departamento) {
        this.departamento = departamento;
    }
}
