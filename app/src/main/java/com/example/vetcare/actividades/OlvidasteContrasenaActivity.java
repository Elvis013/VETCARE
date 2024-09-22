package com.example.vetcare.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.vetcare.R;

public class OlvidasteContrasenaActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextPhone;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_olvidaste_contrasena);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Inicializar vistas
        editTextPhone = findViewById(R.id.editTextPhone);
        btnEnviar = findViewById(R.id.btnEnviar);

        // Configurar listener para el botón
        btnEnviar.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnEnviar) {
            enviarCodigo(); // Método para manejar el botón Enviar
        }
    }

    private void enviarCodigo() {
        String phoneNumber = editTextPhone.getText().toString();

        if (!phoneNumber.isEmpty()) {
            // Aquí puedes agregar la lógica para enviar el código de verificación

            // Redirigir a la actividad de verificación de código
            Intent intent = new Intent(this, ConfirmarCodigoActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Por favor, ingresa un número de teléfono válido", Toast.LENGTH_LONG).show();
        }
    }
}