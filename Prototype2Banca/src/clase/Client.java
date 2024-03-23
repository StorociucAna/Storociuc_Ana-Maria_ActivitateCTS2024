package clase;

public class Client implements ClientAbstract {
    private String nume;
    private String dateBuletin;
    private String dateContCredit;

    public Client(String nume, String dateBuletin, String dateContCredit) {
        this.nume = nume;
        this.dateBuletin = dateBuletin;
        this.dateContCredit = dateContCredit;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", dateBuletin='" + dateBuletin + '\'' +
                ", dateContCredit='" + dateContCredit + '\'' +
                '}';
    }

    @Override
    public ClientAbstract clone() {
        return new Client(nume, dateBuletin, dateContCredit);
    }
}
