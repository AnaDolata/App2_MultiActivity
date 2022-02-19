package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SituationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation);

        TextView out = findViewById(R.id.textViewOutput);

        Intent it = getIntent();
        if (it != null){
            Bundle params = it.getExtras();
            if (params != null){
                String nome = params.getString("nome");
                Double nota1 = params.getDouble("nota1");
                Double nota2 = params.getDouble("nota2");
                int freq = params.getInt("freq");

                Double MF = (nota1 + nota2) / 2;

                if(MF>=7 && freq>=75)
                    out.setText("Aluno " + nome + " Aprovado\n" + "Média Final: " + MF);
                else if(MF>=4 && MF<=6.9 && freq>=75)
                    out.setText("Aluno " + nome + " de Final\n" + "Média Final: " + MF);
                else if(freq<75)
                    out.setText("Aluno " + nome + " Reprovado por Falta\n" + "Média Final: " + MF);
                else if(MF<4)
                    out.setText("Aluno " + nome + " Reprovado por Nota\n" + "Média Final: " + MF);
            }
        }
    }
}