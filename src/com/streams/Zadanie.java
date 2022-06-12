package com.streams;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Zadanie extends GetDataFromFile {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(int priorytet) {
        this.priorytet = priorytet;
    }


    public boolean getWykonaneNieWykonane() {
        return wykonaneNieWykonane;
    }

    public void setWykonaneNieWykonane(boolean wykonaneNieWykonane) {
        this.wykonaneNieWykonane = wykonaneNieWykonane;
    }

    public String getTypZadania() {
        return typZadania;
    }

    public void setTypZadania(String typZadania) {
        this.typZadania = typZadania;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int id;
    private String nazwa;
    public String typZadania;
    private int priorytet;
    private LocalDate data;
    public boolean wykonaneNieWykonane;

    public Zadanie(int id, String nazwa, String typZadania, int priorytet, LocalDate data, boolean wykonaneNieWykonane ) {
        this.id = id;
        this.nazwa = nazwa;
        this.typZadania=typZadania;
        this.priorytet = priorytet;
        this.data = data;
        this.wykonaneNieWykonane= wykonaneNieWykonane;

    }

    public static List<Zadanie> listazadań = new ArrayList<Zadanie>();
    public static List<Zadanie> zrobione = new ArrayList<Zadanie>();
    public static List<Zadanie> niezrobione = new ArrayList<Zadanie>();


    @Override
    public String toString() {
        return "Zadanie{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", typZadania='" + typZadania + '\'' +
                ", priorytet=" + priorytet +
                ", data=" + data +
                ", wykonaneNieWykonane=" + wykonaneNieWykonane +
                '}';
    }

    public static void wyświetlZadanie(){
        Zadanie.listazadań.stream()
                .forEach(System.out::println);
    }












}
