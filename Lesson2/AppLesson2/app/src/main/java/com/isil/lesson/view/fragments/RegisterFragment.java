package com.isil.lesson.view.fragments;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.isil.lesson.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RegisterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegisterFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private EditText eteName,eteEmail,etePassword1,etePassword2;
    private Button butSignUp;

    private String name, email,password1, password2;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RegisterFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RegisterFragment newInstance(String param1, String param2) {
        RegisterFragment fragment = new RegisterFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public RegisterFragment() {
        // Required empty public constructor
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
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        eteName= (EditText)getView().findViewById(R.id.eteName);
        eteEmail= (EditText)getView().findViewById(R.id.eteEmail);
        etePassword1= (EditText)getView().findViewById(R.id.etePassword1);
        etePassword2= (EditText)getView().findViewById(R.id.etePassword2);

        butSignUp = (Button)getView().findViewById(R.id.butSignUp);

        butSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateForm())
                {
                    //enviar al servidor
                    //Toast.makeText(getActivity(),"Enviando al servidor",Toast.LENGTH_LONG).show();
                    showMessage();
                }
            }
        });
    }

    private void showMessage() {


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
                .setTitle("")
                .setMessage("Enviar al servidor...")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        AlertDialog dialog= builder.create();
        dialog.show();
    }

    private boolean validateForm() {

        name= eteName.getText().toString().trim();
        email= eteEmail.getText().toString().trim();
        password1= etePassword1.getText().toString().trim();
        password2= etePassword2.getText().toString().trim();
        clear();

        if(name.equals(""))
        {
            eteName.setError("Ingresar el nombre");
            return false;
        }
        if(email.isEmpty())
        {
            eteEmail.setError("Ingresar el email");
            return false;
        }
        if(password1.isEmpty())
        {
            etePassword1.setError("Ingresar el password");
            return false;
        }

        if(password2.isEmpty())
        {
            etePassword2.setError("Ingresar el password");
            return false;
        }
        if(!password1.equals(password2))
        {
            etePassword2.setError("No conciden las contraseñas");
            return false;
        }

        return true;
    }

    private void clear() {
        eteName.setError(null);
        eteEmail.setError(null);
        etePassword1.setError(null);
        etePassword2.setError(null);
    }
}
