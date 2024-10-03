package com.example.g7s21_242_p1p2_fabiandm;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SaludoActivity extends AppCompatActivity {
    String nombre;
    TextView lblsaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_saludo);
        lblsaludo = findViewById(R.id.lblsaludo);
        Bundle parametros = getIntent().getExtras();
        nombre = parametros.getString("nombre");
        lblsaludo.setText("bienvenido, "+nombre);

    }
}