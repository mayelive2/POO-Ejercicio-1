
/*integrantres: 
  Mayeleen Rodriguez Gomez cod:2016114118
  Luis Hatum
*/


package exercisegradeaverage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Maye
 */
public class ExerciseGradesAverage {
    
    private final int CALIFI_BAJA  = 0;
    private final int CALIFI_ALTA = 100;
    
   
    private int[] grades;
    
    private Scanner in;
    
    public static void main(String[] args) {
              
         ExerciseGradesAverage aGradesAverage = new ExerciseGradesAverage();
        aGradesAverage.in = new Scanner(System.in);

        System.out.print("Ingrese el numero de estudiantes: ");
        int numStudents = aGradesAverage.in.nextInt();
                
        aGradesAverage.run(numStudents);
    }
        
    
    private void run(int numStudents)
    {
        if (numStudents <= 0) {
            System.out.println("Numero de Estudiante Invalido.");
            return;
        }        
        grades = new int[numStudents];
        
        double sum = 0;
        int    i   = 0;
        while (i < numStudents){
            System.out.printf("Ingrese la calificacion para el estudiante  %1$d: ", (i+1));
            int grade = in.nextInt();
            
           
            if ((grade >= CALIFI_BAJA) && (grade <= CALIFI_ALTA)) {
                grades[i] = grade;
                sum      += grade;
                i++;
                continue;
            }
            System.out.println("Calificacion Invalida, intentelo otra vez...");
        }
        System.out.printf("El Promedio es %1$.2f\n", (sum / numStudents));
        
             
    }
    
}
