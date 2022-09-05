package While;

import java.util.Scanner;

public class examPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(scanner.nextLine());
        int goodGradesCounter = 0;
        int poorGradesCounter = 0;
        boolean isFailed = false;
        double allGradesSum = 0 ;
        int gradesCounter = 0 ;
        String lastProblem = "";
        String taskName = scanner.nextLine();
        while(!taskName.equals("Enough")){
            int taskGrade = Integer.parseInt(scanner.nextLine());
            allGradesSum += taskGrade;
            gradesCounter++;
            lastProblem = taskName;
            if(taskGrade<=4){
                poorGradesCounter++;
            }
            // checking if we have reached the limit
            if(poorGradesLimit==poorGradesCounter){
                isFailed = true;
                break;
            }
            taskName = scanner.nextLine();

        }
        double avgScore = allGradesSum / gradesCounter;
        //he has failed
        if(isFailed){
            System.out.printf("You need a break, %d poor grades.", poorGradesCounter);
        }
        //he has solved all the tasks
        else{
            System.out.printf("Average score: %.2f\n" +
                    "Number of problems: %d\n" +
                    "Last problem: %s \n", avgScore,gradesCounter, lastProblem);
        }
    }

}
