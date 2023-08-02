package com.mycompany.siesjdbc.servicios;

import com.mycompany.siesjdbc.persistencia.pEntidades.CursoDao;
import java.util.Scanner;

public class PanelControl {

    Integer opcion;
    PersonaServicio ps = new PersonaServicio();
    EgresadoServicio es = new EgresadoServicio();
    FuncionarioServicio ems = new FuncionarioServicio();
    InstructorServicio prs = new InstructorServicio();
    PersonalServicio pss = new PersonalServicio();

    CursoDao cd = new CursoDao();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        cd.crearCursos();
        Integer opcion = 0;
        do {
            System.out.println("Bienvenido al menú de opciones");
            System.out.println("Elija la opción que necesite");
            System.out.println("1.Crear persona");
            System.out.println("2.Modificar persona");
            System.out.println("3.Eliminar persona");
            System.out.println("4.Listar persona");
            System.out.println("5.Crear Estudiante");
            System.out.println("6.Matricular estudiante");
            System.out.println("7.Modificar egresado");
            System.out.println("8.Retirar estudiante de curso");
            System.out.println("9.Eliminar egresado");
            System.out.println("10.Listar egresado");
            System.out.println("11.Crear funcionario");
            System.out.println("12.Modificar funcionario");
            System.out.println("13.Eliminar funcionario");
            System.out.println("14.Cambiar despacho de funcionario");
            System.out.println("15.Cambiar año de incorporación de empleado");
            System.out.println("16.Listar funcionarios");
            System.out.println("17.Crear instructor");
            System.out.println("18.Modificar instructor");
            System.out.println("19.Eliminar instructor");            
            System.out.println("21.Listar instructores");
            System.out.println("22.Crear empleado de servicio");
            System.out.println("23.Modificar empleado de servicio");
            System.out.println("24.Eliminar empleado de servicio");
            System.out.println("25.Cambiar seccion de empleado de servicio");
            System.out.println("26.Listar empleados de servicio");
            System.out.println("27.Salir");
            opcion = validarOpcion(sc.nextInt());

            switch (opcion) {
                case 1:
                    if (!validarEleccion()) {
                        break;
                    }
                    ps.crearPersona();
                    break;
                case 2:
                    if (!validarEleccion()) {
                        break;
                    }
                    ps.modificarPersona();
                    break;
                case 3:
                    if (!validarEleccion()) {
                        break;
                    }
                    ps.eliminarPersona();
                    break;
                case 4:
                    if (!validarEleccion()) {
                        break;
                    }
                    ps.listarPersonas();
                    break;
                case 5:
                    if (!validarEleccion()) {
                        break;
                    }
                    es.crearEgresado();
                    break;
                case 6:
                    if (!validarEleccion()) {
                        break;
                    }
                    es.matricularEstudianteACurso();
                    break;
                case 7:
                    if (!validarEleccion()) {
                        break;
                    }
                    es.modificarEstudiante();
                    break;
                case 8:
                    if (!validarEleccion()) {
                        break;
                    }
                    es.retirarEstudianteDeCurso();
                    break;
                case 9:
                    if (!validarEleccion()) {
                        break;
                    }
                    es.eliminarEgresados();
                    break;
                case 10:
                    if (!validarEleccion()) {
                        break;
                    }
                    es.listarEgresados();
                    break;
                case 11:
                    if (!validarEleccion()) {
                        break;
                    }
                    ems.crearFuncionario();
                    break;
                case 12:
                    if (!validarEleccion()) {
                        break;
                    }
                    ems.modificarFuncionario();
                    break;
                case 13:
                    if (!validarEleccion()) {
                        break;
                    }
                    ems.eliminarFuncionario();
                    break;
                case 14:
                    if (!validarEleccion()) {
                        break;
                    }
                    ems.cambiarDespacho();
                    break;
                case 15:
                    if (!validarEleccion()) {
                        break;
                    }
                    ems.cambiarAnioDeIncorporacion();
                    break;
                case 16:
                    if (!validarEleccion()) {
                        break;
                    }
                    ems.listarFuncionarios();
                    break;
                case 17:
                    if (!validarEleccion()) {
                        break;
                    }
                    prs.crearInstructor();
                    break;
                case 18:
                    if (!validarEleccion()) {
                        break;
                    }
                    prs.modificarInstructor();
                    break;
                case 19:
                    if (!validarEleccion()) {
                        break;
                    }
                    prs.eliminarInstructor();
                    break;
                case 20:
                    if (!validarEleccion()) {
                        break;
                    }
                    prs.cambiarDepartamento();
                    break;
                case 21:
                    if (!validarEleccion()) {
                        break;
                    }
                    prs.listarInstructores();
                    break;
                case 22:
                    if (!validarEleccion()) {
                        break;
                    }
                    pss.crearPersonalDeServicio();
                    break;
                case 23:
                    if (!validarEleccion()) {
                        break;
                    }
                    pss.modificarPersonalDeServicio();
                    break;
                case 24:
                    if (!validarEleccion()) {
                        break;
                    }
                    pss.eliminarPersonaDeServicio();
                    break;
                case 25:
                    if (!validarEleccion()) {
                        break;
                    }
                    pss.cambiarSeccion();
                    break;
                case 26:
                    if (!validarEleccion()) {
                        break;
                    }
                    pss.listarEgresados();
                    break;

                case 27:
                    break;
            }
        } while (opcion != 27);
        System.out.println("Terminamos!!!!");

    }

    public Integer validarOpcion(Integer opcion) {
        while (opcion < 1 || opcion > 27) {
            System.out.println("Ingrese una opción correcta");
            opcion = sc.nextInt();
        }
        return opcion;
    }

    public Boolean validarEleccion() {
        System.out.println("Desea ejecutar esta acción? S/N");
        String opcionSN = sc.next();
        while (!opcionSN.equalsIgnoreCase("S") && !opcionSN.equalsIgnoreCase("N")) {
            System.out.println("Ingrese una opcion correcta S/N");
            opcionSN = sc.next();
        }
        if (opcionSN.equalsIgnoreCase("s")) {
            return true;
        } else {
            return false;
        }

    }
}
