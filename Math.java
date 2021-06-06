

import java.util.*;
public class Math {

    private String question;
    private ArrayList<String> options;
    private String answer;
    public Math(String question,String[] options,String answer){
        this.question = question;
        this.options = new ArrayList<String>();
        for(int i=0;i< options.length;i++){
            this.options.add(options[i]);
        }
        Collections.shuffle(this.options);
        this.answer = answer;
    }
    public String getQuestion(){
        return question;
    }
    public ArrayList<String> getOptions(){
        return options;
    }
    public String getAnswer(){
        return answer;
    }
}
