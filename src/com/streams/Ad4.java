package com.streams;

import java.util.Objects;
import java.util.Scanner;

public class Ad4 {
    public static void generateRaportCompleted(){

        System.out.println("Lista wykonanych");
        System.out.println(Zadanie.zrobione.size());




    }
    public static void generateRaportType(){
        System.out.println("lista Nie zrobionych");
        for(int i = 0; i<Zadanie.niezrobione.size();i++){
            System.out.println(Zadanie.niezrobione.get(i));
        }





    }
    public static void type(){

        System.out.println("Z podziałem na typ zadania pozostało");

        long prywatne = Zadanie.niezrobione.stream()
                .filter(zadanie -> Objects.equals(zadanie.getTypZadania(),"prywatne")).count();
        System.out.println("Prywatnych: "+ prywatne);

        long służbowe = Zadanie.niezrobione.stream()
                .filter(zadanie -> Objects.equals(zadanie.getTypZadania(),"służbowe")).count();
        System.out.println("Służbowych: "+ służbowe);



    }





}
