package quiz;

import java.util.Scanner;

public class QuestionsService {
    Question[] questions = new Question[5];

    public QuestionsService() {
        questions[0] = new Question(1, "What name?", "Ram", "Shyam",  "Gopal", "David", "Ram");
        questions[1] = new Question(2, "What age?", "1", "2",  "3", "4", "4");
        questions[2] = new Question(3, "What name?", "Ram", "Shyam",  "Gopal", "David", "Ram");
        questions[3] = new Question(4, "What name?", "Ram", "Shyam",  "Gopal", "David", "Ram");
        questions[4] = new Question(5, "What name?", "Ram", "Shyam",  "Gopal", "David", "Ram");
    }

    public void startQuiz(){
        int score = 0;
        for(int i=0; i< questions.length; i++){
            System.out.print("Ques " + i + " " + questions[i].question + " ?");
            System.out.println("a." + questions[i].opt1);
            System.out.println("b." + questions[i].opt2);
            System.out.println("c." + questions[i].opt3);
            System.out.println("d." + questions[i].opt4);
            Scanner sc = new Scanner(System.in);
            String inp = sc.nextLine();
            if(inp.equals(questions[i].ans)){
                score++;
            }
        }
        System.out.println("You scored : " + score);
    }
}
