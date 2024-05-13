package clase;

public interface Subiect {
    void aboneaza(Observer observer);
    void dezaboneaza(Observer observer);
    void notifica(String mesaj);
}
