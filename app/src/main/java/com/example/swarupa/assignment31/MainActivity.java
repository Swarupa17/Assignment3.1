package com.example.swarupa.assignment31;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText text = (EditText)findViewById(R.id.editText);

        Button b1 = (Button)findViewById(R.id.button);

        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                        String term = text.getText().toString();
                        intent.putExtra(SearchManager.QUERY,term);
                        startActivity(intent);
                    }
                }
        );
    }
}
