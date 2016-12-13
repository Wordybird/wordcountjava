package com.example.user.wordcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCountApp extends AppCompatActivity {

    EditText wordCountEditText;
    Button wordCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("WordCount", "onCreateCalled");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordCountEditText=(EditText)findViewById(R.id.word_count_text);
        wordCountButton=(Button)findViewById(R.id.word_count_button);

        wordCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String question = wordCountEditText.getText().toString();
                Log.d("Word Count", "Question: " + question);
                WordCount wordCount = new WordCount();
                String wordCounter = wordCount.splitWords();
                wordCountEditText.setText(wordCounter);
            }
        });
    }

}
