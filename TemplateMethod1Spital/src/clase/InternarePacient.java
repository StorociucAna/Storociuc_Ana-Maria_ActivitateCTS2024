package clase;

abstract class InternarePacient {
    public void internare(){
        analizeazaStarePacient();
        verificaDisponibilitateSaloane();
        emiteFisaInternare();
    }
    protected abstract void analizeazaStarePacient();
    protected abstract void verificaDisponibilitateSaloane();
    protected abstract void emiteFisaInternare();
}
