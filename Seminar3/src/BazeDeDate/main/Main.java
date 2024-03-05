package BazeDeDate.main;

import BazeDeDate.clase.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args){
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getInstance("Baza1", 10, "link1");
        ConexiuneBazaDeDate conexiune2 = ConexiuneBazaDeDate.getInstance("Baza2", 20, "link2");

        conexiune1.setNumeBaza("NumeBazaNoua");
        conexiune2.setNumeBaza("NumeBazaNoua2");

        System.out.println(conexiune1);
        System.out.println(conexiune2);
    }
}
