
package com.mycompany.siesjdbc.enums;


public enum Cursos {
    ALGEBRA("Algebra"), GEOMETRIA("Geometria"), LENGUAS("Lenguas"), ESPANOL("Español"), DISENO("Diseño");
    public String materia;

    Cursos(String materia) {
        this.materia = materia;
    }
}
