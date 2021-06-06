import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class javaQuestionCall {
    private ArrayList<Math> questionSet;
    public javaQuestionCall(){
        questionSet = new ArrayList<Math>();
        String a="Who was the founder of java?";
        String[] Question1_option={"james gosling","larry page","bill gates","sundar pichai"};
        questionSet.add(new Math(a,Question1_option,"james gosling"));
        a = "Which year was java invented?";
        Question1_option = new String[]{"1995","1996","1997","2000"};
        questionSet.add(new Math(a,Question1_option,"1996"));
        a = "What was the java language first called";
        Question1_option = new String[]{"javascript","teak","oak","pine"};
        questionSet.add(new Math(a,Question1_option,"oak"));
        Collections.shuffle(questionSet, new Random());
    }
    public void start(){
        Scanner scan = new Scanner(System.in);
        int numCorrect=0;
        for(int question=0; question<questionSet.size();question++) {
            System.out.println(questionSet.get(question).getQuestion());
            int numChoices;
            numChoices = questionSet.get(question).getOptions().size();
            for (int choice = 0; choice < numChoices; choice++) {
                System.out.println((choice+1) + ": " +
                        questionSet.get(question).getOptions().get(choice));
            }
            int playerAnswer = scan.nextInt();
            ArrayList<String> choiceSet = questionSet.get(question).getOptions();
            String correctAnswer = questionSet.get(question).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if(playerAnswer ==  correctAnswerIndex + 1) {
                numCorrect++;
            }
            System.out.println("The correct answer is " + questionSet.get(question).getAnswer() + " and your selected option is " +playerAnswer);
        }
        scan.close();
        System.out.println("Congratulations!! You Got " + numCorrect + " correct answer");
    }
}
