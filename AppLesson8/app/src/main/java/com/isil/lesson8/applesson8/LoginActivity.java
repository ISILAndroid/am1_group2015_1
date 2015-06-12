package com.isil.lesson8.applesson8;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends ActionBarActivity {

    private EditText eteUsername,etePassword;
    private Button btnLogin;

    private String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //ui
        eteUsername= (EditText)findViewById(R.id.eteUsername);
        etePassword= (EditText)findViewById(R.id.etePassword);
        btnLogin= (Button)findViewById(R.id.btnLogin);

        //eventos
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username= eteUsername.getText().toString();
                password= etePassword.getText().toString();
                if(!username.isEmpty())// si no esta vacio
                {
                    gotoMain();
                }else
                {
                    eteUsername.setError("Horror ! ");
                }

            }
        });
    }

    private void gotoMain() {

        Intent intent= new Intent(this,MainActivity.class);
        intent.putExtra("USERNAME", username);
        intent.putExtra("PASSWORD", password);
        startActivity(intent);
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
