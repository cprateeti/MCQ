package com.example.mcq;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private String mAnswer;
    private int mScore = 0;
    int count=0;
    private int mQuestionNumber = 0;
    String s;
    SharedPreferences sp;
    SharedPreferences.Editor rs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreView = findViewById(R.id.score);
        mQuestionView = findViewById(R.id.question);
        mButtonChoice1 = findViewById(R.id.choice1);
        mButtonChoice2 = findViewById(R.id.choice2);
        mButtonChoice3 = findViewById(R.id.choice3);
        sp = getSharedPreferences("pqrst",MODE_PRIVATE);
        rs = sp.edit();


        updateQuestion();


        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count>5)
                {
                    s = mScoreView.getText().toString();
                    rs.putString("pooh",s);
                    rs.commit();
                    Intent in = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(in);
                }
                if(mButtonChoice1.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    if(mQuestionNumber!=5){
                        updateQuestion();
                    }
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber!=5){
                        updateQuestion();
                    }

                }
            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count>5)
                {
                    s = mScoreView.getText().toString();
                    rs.putString("pooh",s);
                    rs.commit();
                    Intent in = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(in);
                }
                if(mButtonChoice2.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    if(mQuestionNumber!=5){
                        updateQuestion();
                    }
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber!=5){
                        updateQuestion();
                    }

                }
            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count>5)
                {
                    s = mScoreView.getText().toString();
                    rs.putString("pooh",s);
                    rs.commit();
                    Intent in = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(in);
                }
                if(mButtonChoice3.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    if(mQuestionNumber!=5){
                        updateQuestion();
                    }
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber!=5){
                        updateQuestion();
                    }

                }
            }
        });

    }
    private void updateQuestion(){

            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);

            mQuestionNumber++;

    }
    private void updateScore(int point){
        mScoreView.setText(""+mScore);
    }

    public void qqq(View view) {
        AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
        b.setTitle("Final Alert");
        b.setMessage("Do You Want To Quit the Quiz");
        b.setIcon(android.R.drawable.ic_media_play);
        b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                System.exit(0);
            }
        });
        b.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                s = mScoreView.getText().toString();
                rs.putString("pooh",s);
                rs.commit();
                Intent in = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(in);

            }
        });
        b.show();
    }
}