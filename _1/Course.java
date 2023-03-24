package javaoop.exercises._1._1;

import java.util.Arrays;
import java.util.List;

public class Course {
    String courseName = "Corso Java";
    String teacherName = "Francesco Checchia";
    String tutorName = "Veronica Rametta";


    public static void qualityRatingOutOf10(int b){
        switch (b){
            case 1 :
                System.out.println("bocciato, meglio che cambi corso");
                break;
            case 2 :
                System.out.println("bocciato,meglio che cambi corso");
                break;
            case 3 :
                System.out.println("bocciato,poteva andare peggio!");
                break;
            case 4 :
                System.out.println("bocciato,poteva andare meglio!");
                break;
            case 5 :
                System.out.println("bocciato,hai un'altro tentativo,puoi farcela");
                break;
            case 6 :
                System.out.println("Promosso,al limite :)");
                break;
            case 7 :
                System.out.println("Promosso, distinto");
                break;
            case 8 :
                System.out.println("Promosso, molto buono");
                break;
            case 9 :
                System.out.println("Promosso, ottimo");
                break;
            case 10 :
                System.out.println("EXCELENT :)");
                break;
            default:
                System.out.println("non hai fatto l'esame");
        }
    }

    public static int maxStudent(int a) {

        if (a > 15) {
            System.out.println("scoretto");
        } else {
            System.out.println(a);
        }return a;
    }

    List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
    List<Integer> studentAges = Arrays.asList(23, 31, 38);


}
