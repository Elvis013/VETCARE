package com.example.vetcare.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.vetcare.R;

public class SesionActivity extends AppCompatActivity implements View.OnClickListener{

    EditText txtCorreo, txtClave;
    Button btnIngresar, btnRegistrarse, btnSOS;
    CheckBox checkRecordar;
    TextView lblOlvidateContraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sesion);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Inicializar vistas
        txtCorreo = findViewById(R.id.logTxtCorreo);
        txtClave = findViewById(R.id.logTxtClave);
        btnIngresar = findViewById(R.id.LogBtnIngresar);
        btnRegistrarse = findViewById(R.id.LogBtnRegistrate); // Nuevo botón Registrarse
        btnSOS = findViewById(R.id.LogBtnSOS); // Botón SOS
        checkRecordar = findViewById(R.id.logChkRecordar);
        lblOlvidateContraseña = findViewById(R.id.logLblOlvidateContraseña);

        // Configurar listeners para los botones y el TextView
        btnIngresar.setOnClickListener(this);
        btnRegistrarse.setOnClickListener(this); // Listener para el botón Registrarse
        btnSOS.setOnClickListener(this); // Listener para el botón SOS
        lblOlvidateContraseña.setOnClickListener(this); // Listener para el olvido de contraseña

    }

    @Override
    public void onClick(View v) {
        // Usando if-else if para manejar los clics
        if (v.getId() == R.id.LogBtnIngresar) {
            iniciarSesion(txtCorreo.getText().toString(), txtClave.getText().toString(), checkRecordar.isChecked());
        } else if (v.getId() == R.id.LogBtnRegistrate) {
            registrar(); // Método para manejar el botón Registrarse
        } else if (v.getId() == R.id.LogBtnSOS) {
            mostrarSOS(); // Método para manejar el botón SOS
        } else if (v.getId() == R.id.logLblOlvidateContraseña) {
            irOlvidoContrasena(); // Método para manejar el olvido de contraseña
        }
    }

    private void iniciarSesion(String correo, String clave, boolean recordar) {
        // Validar credenciales en base de datos o lógica específica
        if (correo.equals("elvira@upn.pe") && clave.equals("2024-2")) {
            Intent bienvenida = new Intent(this, ReservaCitaActivity.class);
            bienvenida.putExtra("nombre", "Elvira Montana");
            startActivity(bienvenida);
            finish();
        } else {
            Toast.makeText(this, "Error: Credenciales incorrectas", Toast.LENGTH_LONG).show();
        }
    }

    private void registrar() {
        Intent registro = new Intent(this, ReservaCitaActivity.class);
        startActivity(registro);
    }

    private void mostrarSOS() {
        // Mostrar mensaje de emergencia o realizar alguna acción de emergencia
        Toast.makeText(this, "¡Emergencia SOS activada!", Toast.LENGTH_LONG).show();
    }

    private void irOlvidoContrasena() {
        Intent olvidoContrasena = new Intent(this, OlvidasteContrasenaActivity.class);
        startActivity(olvidoContrasena);
    }
}