package com.streams;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Ad3  {

    public static void ustawWykonaneNieWykonane(){

        System.out.println("Podaje id zadanie dla ktore chcesz zmienic status");
        Scanner scanner = new  Scanner(System.in);
         int podajId = scanner.nextInt();


        Zadanie.listazadań.stream()
                .filter(zadanie -> zadanie.id == podajId)
                .peek(zadanie -> {
                    if(podajId==(zadanie.getId()))
                    {
                        if(zadanie.getWykonaneNieWykonane()==false)
                        {
                            zadanie.setWykonaneNieWykonane(true);

                            Zadanie.zrobione.add(zadanie);
                            Zadanie.niezrobione.remove(zadanie);

                        }else{
                            zadanie.setWykonaneNieWykonane(false);
                            Zadanie.niezrobione.add(zadanie);
                            Zadanie.zrobione.remove(zadanie);

                        }


                    }
                })
                .forEach(System.out::println);
















    }




}
