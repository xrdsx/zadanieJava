package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ad2 {



    public static void sortByPriority() {
        List<Zadanie> sortedList = Zadanie.listazadań.stream()
                .sorted(Comparator.comparingInt((Zadanie::getPriorytet)))

                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);


    }



    public static  void sortByDate(){
        List<Zadanie> sortedList = Zadanie.listazadań.stream()
                .sorted(Comparator.comparing((Zadanie::getData)))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);

    }

}
