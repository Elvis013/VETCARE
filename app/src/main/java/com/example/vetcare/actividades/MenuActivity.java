package com.example.vetcare.actividades;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.vetcare.R;
import com.example.vetcare.actividades.clases.Menu;
import com.example.vetcare.actividades.fragmentos.perfilMascotaFragment;
import com.example.vetcare.actividades.fragmentos.perfilUsuarioFragment;

public class MenuActivity extends AppCompatActivity implements Menu {
    Fragment[] fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        fragments = new Fragment[6];

        fragments[4] = new perfilUsuarioFragment();
        fragments[5] = new perfilMascotaFragment();

        int id = getIntent().getIntExtra("id", -1);
        onClickMenu(id);
    }

    @Override
    public void onClickMenu(int id) {
        FragmentManager fr = getSupportFragmentManager();
        FragmentTransaction ft = fr.beginTransaction();
        ft.replace(R.id.menRelArea, fragments[id]);
        ft.commit();
    }
}