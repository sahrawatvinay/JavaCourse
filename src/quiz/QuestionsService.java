package quiz;

public class QuestionsService {
    Question[] questions = new Question[5];

    public QuestionsService() {
        questions[0] = new Question(1, "What name?", "Ram", "Shyam",  "Gopal", "David", "Ram");
        questions[1] = new Question(2, "What age?", "1", "2",  "3", "4", "4");
        questions[2] = new Question(3, "What name?", "Ram", "Shyam",  "Gopal", "David", "Ram");
        questions[3] = new Question(4, "What name?", "Ram", "Shyam",  "Gopal", "David", "Ram");
        questions[4] = new Question(5, "What name?", "Ram", "Shyam",  "Gopal", "David", "Ram");
    }

    public void displayQuestions(){
        for(Question q : questions){
            System.out.println(q.toString());
        }
    }
}
