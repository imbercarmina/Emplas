package com.mycompany.sprint2;

public class Main {

    public static void main(String[] args) {



        Employee empleado1 = new Employee ("Simón Bolivar","empleadi1@gmail.com", Enum_RoleName.Admin);
        Enterprise empresa1 = new Enterprise("COCACOLA");


        System.out.println("El nombre del empleado es: " + empleado1.getNombre());
        System.out.println("el correo electronico es: " + empleado1.getEmail());
        System.out.println("el rol del usuario es: " + Enum_RoleName.Admin);
        System.out.println("La empresa es: " + empresa1.getName());


        empleado1.setNombre("Julio Cesar");
        System.out.println("el nuevo nombre es: " + empleado1.getNombre());

        empleado1.setEmail("employ1@rocketmail.com");
        System.out.println("el nuevo email es: " + empleado1.getEmail());

        empleado1.setRole(Enum_RoleName.Operario);
        System.out.println("El nuevo rol del usuario es: " + empleado1.getRole());

        empresa1.setName("Pepsi");
        System.out.println("El nuevo nombre de la empresa es: " + empresa1.getName());



    }


}
