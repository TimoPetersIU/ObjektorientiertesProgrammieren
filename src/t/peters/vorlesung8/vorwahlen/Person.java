package t.peters.vorlesung8.vorwahlen;

public class Person {
    private String name;
    private String telefonnummer;
    private Nationalitaet nationalitaet;

    public Person(String name, String telefonnummer, Nationalitaet nationalitaet) {
        this.name = name;
        this.telefonnummer = telefonnummer;
        this.nationalitaet = nationalitaet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public Nationalitaet getNationalitaet() {
        return nationalitaet;
    }

    public void setNationalitaet(Nationalitaet nationalitaet) {
        this.nationalitaet = nationalitaet;
    }

    public String getFullTelefonnummer() {
        return nationalitaet.getVorwahl() + " " + telefonnummer;
    }
}
