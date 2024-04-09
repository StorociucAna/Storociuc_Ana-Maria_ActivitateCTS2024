package main;

import decorator.Decorator;
import spital.Diagnostic;
import spital.DiagnosticAbstract;
import decorator.AplicatieMobila;
import decorator.WebSite;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diagnostic =  new Diagnostic("Raceala", "Rosu in gat",
                false);
        diagnostic.printeazaDiagnostic();

        Decorator decorator = new AplicatieMobila(diagnostic);
        decorator.afiseazaOnline();
        decorator.printeazaDiagnostic();

        Decorator website = new WebSite(diagnostic);
        website.afiseazaOnline();
        website.printeazaDiagnostic();
    }
}
