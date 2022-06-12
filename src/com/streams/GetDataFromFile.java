package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;


public abstract class GetDataFromFile {

    public static void wczytajPlikDoListy() throws IOException {


        String path = "\\Users\\polfr\\Downloads\\lista.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line ="";
        while((line =br.readLine())!= null ){

            String [] czesciOdczytane = line.split(",");

            int id = Integer.parseInt(czesciOdczytane[0]);
            String nazwa=czesciOdczytane[1];
            String typZadania=czesciOdczytane[2];
            int priorytet=Integer.parseInt(czesciOdczytane[3]);
            String data = czesciOdczytane[4];
            boolean wykonaneNieWykonane = false;

            Zadanie zadanie = new Zadanie(Integer.valueOf(id),nazwa,typZadania,Integer.valueOf(priorytet), LocalDate.parse(data),wykonaneNieWykonane);
            Zadanie.listazadań.add(zadanie);
            Zadanie.niezrobione.add(zadanie);



        }



    }

    public static String readedFile(){
        System.out.println("====================PLIKI ZOSTALY WCZYTANE====================");

        return "wczytanopliki";
    }
}


