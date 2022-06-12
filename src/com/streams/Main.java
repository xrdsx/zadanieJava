package com.streams;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        do{
            Menu.viewMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wybierz pozycje menu klikając przyciski od 1-5");
            int userChoose = scanner.nextInt();
            if(userChoose == 5){
                Menu.closeProgram = false;
            }
            if(userChoose ==1){
                System.out.println("Wczytywanie plików do trablicy");
                GetDataFromFile.wczytajPlikDoListy();
                GetDataFromFile.readedFile();
                System.out.println("================");
                System.out.println("");
                Menu.viewMenu();
                System.out.println("Wybierz pozycje menu klikając przyciski od 1-5");
                userChoose = scanner.nextInt();


            }
            if(userChoose ==2){
                Zadanie.wyświetlZadanie();
                System.out.println("Jak sortowac");
                System.out.println("1.PRIORYTET");
                System.out.println("2.DATA");
                int userFilter = scanner.nextInt();

                if(userFilter == 1){
                    Ad2.sortByPriority();
                }
                if(userFilter ==2){
                    Ad2.sortByDate();
                }
                System.out.println("================");
                System.out.println("");
                Menu.viewMenu();
                System.out.println("Wybierz pozycje menu klikając przyciski od 1-5");
                userChoose = scanner.nextInt();
            }
            if(userChoose ==3){
                Ad3.ustawWykonaneNieWykonane();
                System.out.println("================");
                System.out.println("");
                Menu.viewMenu();
                System.out.println("Wybierz pozycje menu klikając przyciski od 1-5");
                userChoose = scanner.nextInt();
            }
            if (userChoose == 4){
                System.out.println("Co chceesz sprawdzic");
                System.out.println("1.Ile zadań zostało użytkownikowi do wykonania z podziałem na typ.");
                System.out.println("2.Ile zadań zostało wykonanych.");
                int userChecRaport = scanner.nextInt();
                if (userChecRaport == 1) {
                    Ad4.type();
                }
                if (userChecRaport ==2){
                    Ad4.generateRaportCompleted();
                }
                System.out.println("================");
                System.out.println("");
                Menu.viewMenu();
                System.out.println("Wybierz pozycje menu klikając przyciski od 1-5");
                userChoose = scanner.nextInt();




            }





        }while(Menu.closeProgram == true);











    }}

