package com.example.mcq;

public class QuestionLibrary {
    private String mQuestions [] = {
            "What was the name of Bunny and Naina's tour guide?",
            "Which iconic song do Bunny and Avi sing, to wake up Aditi on the Manali trip?",
            "Which song does Naina plan to dance on for Aditi's wedding?",
            "Pick the right sequence: ",
            "Which university does Bunny get selected into?"

    };
    private String mchoices [][] = {
            {"Sumit","Sumer","Shobhit"},
            {"Tamma Tamma Doge","Jumma Chumma","Kajra Re"},
            {"Bole Chudiyan","Wah Wah Ram Ji","You Are My Sonia"},
            {"Main daudna chahta hun, udna chahta hun, rukna bhi chahta hun, bas girna nahi chahta","Main udna chahta hun, daudna chahta hun, rukna bhi chahta hun, bas girna nahi chahta","Main udna chahta hun, daudna chahta hun, girna bhi chahta hun, bas rukna nahi chahta"},
            {" Northwestern University in Chicago","NYU","King's College London"}

    };
    private String mCorrectAnswers[] = {"Sumer","Jumma Chumma","Bole Chudiyan","Main udna chahta hun, daudna chahta hun, girna bhi chahta hun, bas rukna nahi chahta"," Northwestern University in Chicago"};



    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0 = mchoices[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mchoices[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mchoices[a][2];
        return choice2;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
