import java.util.ArrayList;
import java.util.Collections;
public class Java {
    private String question;
    private ArrayList<String> options;
    private String answer;

    public Java(String question, String[] options, String Answer) {
        this.question = question;
        this.options = new ArrayList<String>();
        for (int i = 0; i < options.length; i++) {
            this.options.add(options[i]);
        }
        Collections.shuffle(this.options);
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public String getAnswer() {
        return answer;
    }
}
