package MisEjercicios;

import java.util.Scanner;

//El objetivo de este ejercicio es averiguar si el usuario es mayor de edad.
public class MayoriaDeEdad {

    static Scanner entrada = new Scanner(System.in);
    static final int EDAD_MAXIMA = 18;
    static final int YEAR_ACTUAL = 2025;

    public static void main(String[] args) {
        mayoriaDeEdad();
    }

    //El metodo yearNacimiento() se encarga de pedir el año en el que el usuario nació.
    public static short yearNacimiento() {
        short year;
        System.out.println("¿En que año naciste?");
        year = entrada.nextShort();
        entrada.close();
        return year;
    }

    //El metodo mayoria de edad se encarga de averiguar si el usuario es mayor de edad o no.
    public static void mayoriaDeEdad() {
        if (YEAR_ACTUAL - yearNacimiento() < EDAD_MAXIMA) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }

    }
}
