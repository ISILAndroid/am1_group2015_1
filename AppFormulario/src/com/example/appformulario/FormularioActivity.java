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
import android.widget.DatePicker;
import android.widget.TextView;

public class FormularioActivity extends Activity {

	private TextView txtfecnac;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_formulario);
		app();
	}

	private void app() {
		// TODO Auto-generated method stub
		txtfecnac =(TextView)findViewById(R.id.lblfecnac);
		
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
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.formulario, menu);
		return true;
	}

}
