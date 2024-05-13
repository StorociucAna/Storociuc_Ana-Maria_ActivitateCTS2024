package main;

import clase.Item;
import clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Sectiune meniuPrincipal = new Sectiune("Meniu principal");
        Sectiune sectiuneStartere = new Sectiune("Startere");
        sectiuneStartere.adauga(new Item("Supa de pui"));

        Sectiune sectiuneBauturi = new Sectiune("Bauturi");
        sectiuneBauturi.adauga(new Item("Apa plata"));

        Sectiune subsectiuneSucuri = new Sectiune("Sucuri");
        subsectiuneSucuri.adauga(new Item("Suc de portocale"));
        sectiuneBauturi.adauga(subsectiuneSucuri);

        meniuPrincipal.adauga(sectiuneStartere);
        meniuPrincipal.adauga(sectiuneBauturi);

        meniuPrincipal.afiseaza();

        meniuPrincipal.sterge(sectiuneBauturi);
        meniuPrincipal.afiseaza();
    }
}
