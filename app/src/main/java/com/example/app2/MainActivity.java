package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view){
        EditText nome = findViewById(R.id.editTextNome);
        EditText nota1 = findViewById(R.id.editTextNota1);
        EditText nota2 = findViewById(R.id.editTextNota2);
        EditText freq = findViewById(R.id.editTextFreq);

        Intent it = new Intent(this, SituationActivity.class);
        Bundle params = new Bundle();
        params.putString("nome", nome.getText().toString());
        params.putDouble("nota1", Double.parseDouble(nota1.getText().toString()));
        params.putDouble("nota2", Double.parseDouble(nota2.getText().toString()));
        params.putInt("freq", Integer.parseInt(freq.getText().toString()));

        it.putExtras(params);
        startActivity(it);
    }
}