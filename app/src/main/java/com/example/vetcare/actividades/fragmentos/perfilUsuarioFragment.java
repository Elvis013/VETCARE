package com.example.vetcare.actividades.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.vetcare.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link perfilUsuarioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class perfilUsuarioFragment extends Fragment implements View.OnClickListener {

    ImageView imagenUsuario;
    EditText txtNombres,txtApellidos,txtNumeroTelefono,txtCorreo;
    ImageButton btnMascota, btnAgregarMascota;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public perfilUsuarioFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment perfilUsuarioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static perfilUsuarioFragment newInstance(String param1, String param2) {
        perfilUsuarioFragment fragment = new perfilUsuarioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista =inflater.inflate(R.layout.fragment_perfil_usuario, container, false);
        imagenUsuario=vista.findViewById(R.id.imagenUsuario);
        txtNombres=vista.findViewById(R.id.regTxtNombre);
        txtApellidos=vista.findViewById(R.id.regTxtApellido);
        txtNumeroTelefono=vista.findViewById(R.id.regTxtTelefono);
        txtCorreo=vista.findViewById(R.id.regTxtCorreo);

        btnMascota=vista.findViewById(R.id.btnInfoMascota);
        btnAgregarMascota=vista.findViewById(R.id.btnAgregarMascota);

        btnMascota.setOnClickListener(this);
        btnAgregarMascota.setOnClickListener(this);

        return vista;
    }

    @Override
    public void onClick(View view) {
//        if(view.getId() == R.id.btnInfoMascota){
//            Fragment perfil_Mascota = new perfilMascotaFragment()
//            // Realiza la transacción del fragmento utilizando el FragmentManager
//            getParentFragmentManager().beginTransaction()
//                    .replace(R.id.frg_container_perfilUsuario, perfil_Mascota)
//                    .addToBackStack(null) // Permitir retroceder al fragmento anterior
//                    .commit();
//
//
//        }
    }
}