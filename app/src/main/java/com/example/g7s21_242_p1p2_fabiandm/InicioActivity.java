package com.example.g7s21_242_p1p2_fabiandm;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InicioActivity extends AppCompatActivity {
    EditText txtnombre;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio);
        txtnombre = findViewById(R.id.txtnombre);

    }
    public void btnclick(View v){
        Intent pantalla = new Intent(this, SaludoActivity.class);
        pantalla.putExtra("nombre",txtnombre.getText().toString());
        startActivity(pantalla);
        finish();
    }
}