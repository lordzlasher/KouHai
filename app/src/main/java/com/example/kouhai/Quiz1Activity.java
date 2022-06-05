package com.example.kouhai;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Quiz1Activity extends AppCompatActivity implements View.OnClickListener{

    TextView questionTextView, subquestion, nilai, hasil;
    Button ansA, ansB, ansC;
    Button submitBtn;
    LottieAnimationView gambarhasil;

    int score=0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);


        questionTextView = findViewById(R.id.question);
        subquestion = findViewById(R.id.subquestion);
        nilai = findViewById(R.id.nilaiquiz);
        hasil = findViewById(R.id.hasilnya);
        gambarhasil = findViewById(R.id.animasiresult);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        submitBtn = findViewById(R.id.submit_btn);
        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        submitBtn.setOnClickListener(this);
        loadNewQuestion();
    }

    @Override
    public void onClick(View view) {

        ansA.setBackgroundResource(R.drawable.buttonquizputih);
        ansB.setBackgroundResource(R.drawable.buttonquizputih);
        ansC.setBackgroundResource(R.drawable.buttonquizputih);

        Button clickedButton = (Button) view;

        if(clickedButton.getId()==R.id.submit_btn){
            if(selectedAnswer.equals("")){
                return;
            }
            if(selectedAnswer.equals(QuestionAnswer.correctAnswers[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();
            selectedAnswer="";


        }else{
            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundResource(R.drawable.buttonquizhijau);

        }

    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        }

        questionTextView.setText(QuestionAnswer.question[currentQuestionIndex]);
        subquestion.setText(QuestionAnswer.subquestion[currentQuestionIndex]);
        ansA.setText(QuestionAnswer.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer.choices[currentQuestionIndex][2]);

    }

    void finishQuiz(){
        String passStatus = "";
        if(score > totalQuestion*0.60){
            passStatus = "Kamu Sudah Menguasai Materi !";


        }else{
            passStatus = "Kamu Belum Menguasai Materi !";

        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score+" out of "+ totalQuestion)
                .setIcon(R.drawable.senpaibulet)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();


    }

    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        loadNewQuestion();
    }

}