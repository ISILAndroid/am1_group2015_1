package com.isil.parcial;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FormActivity extends ActionBarActivity {

    private EditText eteCompra1;
    private TextView tviIGV;
    private Button btnCalcular;

    private double valor1, valor2, valor3, valor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //asiganmos a variables los elementos gráficos
        eteCompra1= (EditText)findViewById(R.id.eteCompra1);
        tviIGV= (TextView)findViewById(R.id.tviIGV);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);

        //eventos de usuario

        /*btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ejecutar una acción
            }
        });*/
    }

    /**
     * Este método valida cada campo antes de realizar una operación
     * @return
     */
    private boolean validarFormulario()
    {
        //obtener valores del formulario
        String v1= eteCompra1.getText().toString();
        //String v2= eteCompra2.getText().toString();
        //validar valores
        if(v1==null)
        {
            //que debe pasar ?
        }
        if(v1.isEmpty())
        {
            //que debe pasar ?
        }
        // se supone que v1 !=null
        valor1= Double.parseDouble(v1);

        return true;
    }

    /**
     * Este método realiza una operación y devuelve un resultado
     * @param v1
     * @param v2
     * @return
     */
    private double calcular(double v1, double v2)
    {
        double suma= v1+v2;
        return suma;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return false;
    }
}
