package com.example.vetcare.actividades;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vetcare.R;
import com.example.vetcare.actividades.clases.Mascota;
import com.example.vetcare.actividades.clases.MascotaAdapter;

import java.util.ArrayList;
import java.util.List;

public class SeleccionarMascotaActivity extends AppCompatActivity {
    private RecyclerView recyclerViewMascotas;
    private MascotaAdapter mascotaAdapter;
    private List<Mascota> listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seleccionar_mascota);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerViewMascotas = findViewById(R.id.recyclerSeleccionMascota);
        recyclerViewMascotas.setLayoutManager(new LinearLayoutManager(this));

        // Carga la lista de mascotas (puede venir de una base de datos o de otra fuente)
        listaMascotas = obtenerListaDeMascotas();

        // Configura el adapter
        mascotaAdapter = new MascotaAdapter(this, listaMascotas);
        recyclerViewMascotas.setAdapter(mascotaAdapter);
    }

    // Método que crea una lista de mascotas (puedes reemplazar esto con datos reales)
    private List<Mascota> obtenerListaDeMascotas() {
        List<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Max", R.drawable.perro1_95x70));  // Asegúrate de tener imágenes en res/drawable
        mascotas.add(new Mascota("Luna", R.drawable.gato1_95x70));
        // Agrega más mascotas según sea necesario
        return mascotas;
    }
}