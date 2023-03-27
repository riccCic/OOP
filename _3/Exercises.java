package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Studente studente = new Studente("Riccardo ", "Ciciriello, ", 25, " via c.monterosa,12");

        System.out.println(studente.getName() + studente.getLastname() + "ha " + studente.getAge() + " anni, è abita in" + studente.getIndirizzo());
        studente.setMaxAgeInCourse("Riccardo", 25);
        studente.setAge(17);
        studente.setName("Roberta ");
        studente.setLastname("Rossi ");
        studente.setIndirizzo(" via giuseppe verdi,15");

        System.out.println(studente.getName() + studente.getLastname() + "ha " + studente.getAge() + " anni, è abita in" + studente.getIndirizzo());
        studente.setMaxAgeInCourse("Roberta", 17);
    }
    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Studente studente = new Studente("Riccardo ", "Ciciriello, ", 25, " via c.monterosa,12");
        studente.StudenteVoto("Riccardo", 59);

        studente.setName(" ");
        studente.getName();
        System.out.println(Studente.numberName);



    }

}


