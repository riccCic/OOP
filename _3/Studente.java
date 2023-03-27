package javaoop.exercises._3;

public class Studente {
    private String name;
    private String lastname;
    private Integer age;
    private String indirizzo;
    private int maxAgeInCourse = 0;
    private int votoSuperiori = 0;
    static int numberName = 0;

    public Studente(String name, String lastname, int age, String indirizzo) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.indirizzo = indirizzo;

    }

    public Studente() {

    }

    public String getName() {
        if (name == " ") {
            System.out.println("questo studente non ha inserito il nome");
        } else {
            System.out.println("valido");
        }
        numberName = numberName++;
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setMaxAgeInCourse(String name, int maxAgeInCourse) {
        if (this.age >= 18) {
            this.maxAgeInCourse = maxAgeInCourse;
            System.out.println("può frequentare il corso");
        } else {
            System.out.println("non può frequentare il corso");
        }
    }

    public int getVotoSuperiori() {
        return votoSuperiori;
    }

    public void setVotoSuperiori(int votoSuperiori) {
        this.votoSuperiori = votoSuperiori;
    }

    public void StudenteVoto(String name, int votoSuperiori) {
        this.votoSuperiori = votoSuperiori;
        if (votoSuperiori < 60) {
            System.out.println("non puoi essere ammesso perchè hai:" + votoSuperiori);
        } else {
            System.out.println("sei stato ammesso");
        }

    }

}



