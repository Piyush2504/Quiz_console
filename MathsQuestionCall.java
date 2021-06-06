import java.util.*;
public class MathsQuestionCall {
    private ArrayList<Math> questionSet;
    public MathsQuestionCall(){
        questionSet = new ArrayList<Math>();
        String a="What is the product of 5 and 6?";
        String[] Question1_option={"50","30","100","25"};
        questionSet.add(new Math(a,Question1_option,"30"));
        a = "What is 32/2?";
        Question1_option = new String[]{"14","15","16","12"};
        questionSet.add(new Math(a,Question1_option,"16"));
        a = "What is the remainder of 12/4?";
        Question1_option = new String[]{"1","2","4","0"};
        questionSet.add(new Math(a,Question1_option,"0"));
        Collections.shuffle(questionSet, new Random());
    }
    public void start(){
        Scanner scan = new Scanner(System.in);
        int numCorrect=0;
        for(int question=0; question<questionSet.size();question++) {
            System.out.println(questionSet.get(question).getQuestion());

            int numChoices = questionSet.get(question).getOptions().size();
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
        System.out.println("\n\n\nCongratulations!! You Got " + numCorrect + " correct answer in the maths quiz");
    }


}

