package com.example.appformulario;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class FormularioActivity extends Activity {

	private TextView txtfecnac;
	private EditText eteName,eteLastname,etePassword,eteEmail,eteUsername;
    private Spinner spLocation;
    private RadioGroup rbGenero;
    private CheckBox chkNotification;

    private Button btnSignUp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_formulario);
		app();
	}

	private void app() {
		// TODO Auto-generated method stub
		txtfecnac =(TextView)findViewById(R.id.lblfecnac);
        eteName =(EditText)findViewById(R.id.eteName);
        eteLastname =(EditText)findViewById(R.id.eteLastname);
        etePassword =(EditText)findViewById(R.id.etePassword);
        eteEmail =(EditText)findViewById(R.id.eteEmail);
        eteUsername =(EditText)findViewById(R.id.eteUsername);

        spLocation =(Spinner)findViewById(R.id.spLocation);
        rbGenero =(RadioGroup)findViewById(R.id.rbGenero);
        chkNotification =(CheckBox)findViewById(R.id.chkNotification);

        btnSignUp =(Button)findViewById(R.id.btnSignUp);

		events();
	}

	private void events() {
		// TODO Auto-generated method stub
		txtfecnac.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(100);
			}
		});

        btnSignUp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateForm())
                {

                }
            }
        });
	}

    private boolean validateForm()
    {
        String name= eteName.getText().toString().trim();
        String lastName= eteLastname.getText().toString().trim();
        String usernmame= eteUsername.getText().toString().trim();
        String email= eteEmail.getText().toString().trim();
        String password= etePassword.getText().toString().trim();

        //fecha nacimiento

        //localidad

        //genero

        //notification
        boolean notification= chkNotification.isChecked();
        if(!notification)return  false;

        return true;
    }

	
	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		switch (id) {
		case 100:
				final Calendar c=Calendar.getInstance();
				int year=c.get(Calendar.YEAR);
				int month=c.get(Calendar.MONTH);
				int day=c.get(Calendar.DAY_OF_MONTH);
				
				return new DatePickerDialog(this, new OnDateSetListener() {
					
					@Override
					public void onDateSet(DatePicker view, int year, int monthOfYear,
							int dayOfMonth) {
						// TODO Auto-generated method stub
						String s= dayOfMonth+"/"+(monthOfYear+1)+"/"+year;
						txtfecnac.setText(s);
						
						
					}
				}, year, month, day);

		default:
			break;
		}
		return null;
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		return false;
	}

}
