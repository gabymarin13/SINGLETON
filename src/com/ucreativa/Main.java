package com.ucreativa;


public class Main {

    public static void main(String[] args) {
        System.out.println("Si ves el mismo valor, significa que el Singleton se reutilizó ( Yupiii!! ) \n" +
                "Si ves valores diferentes, es porque 2 Singleton fueron creados ( Buuuu !!!) ");
        Singleton single1 = Singleton.getInstance("FUUU");
        Singleton single2 = Singleton.getInstance("GEEE");

        System.out.println(single1.valor);
        System.out.println(single2.valor);
    }
}
