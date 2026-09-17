package com.example.taskmaster;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TaskFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_form);

        CheckBox cbUrgente = findViewById(R.id.cbUrgente);
        RadioGroup rgPrioridad = findViewById(R.id.rgPrioridad);
        RatingBar ratingImportancia = findViewById(R.id.ratingImportancia);
        Button btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(v -> {
            boolean urgente = cbUrgente.isChecked();
            int prioridadId = rgPrioridad.getCheckedRadioButtonId();
            float importancia = ratingImportancia.getRating();

            String mensaje = "Urgente: " + urgente + " | Importancia: " + importancia;
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
        });
    }
}