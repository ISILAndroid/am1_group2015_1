package com.example.applistsimple;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends Activity {

	private String[] data = new String[]{ "Mercury", "Venus", "Earth", "Mars",  
            "Jupiter", "Saturn", "Uranus", "Neptune"};
	private ListView lstPlanets;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
        /**
         * PASOS PARA TRABAJAR CON LISTAS Y ADAPTADORES
         *  1. DATA , puede ser un ArrayList, List, XML
         *  2. VIEW, normalmente es un listview, gridview o un spinner
         *  3. ADAPTER , Arraydapter, BaseAdapter, Cursor Adapter
         *  4. SETEAR ADAPTER AL VIEW
         */
		//listview
		lstPlanets =(ListView)findViewById(R.id.lstPlanets);
		//data
		//adapter
		ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this, 
				R.array.arr_planets, android.R.layout.simple_list_item_1);
		
		ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, data);
		lstPlanets.setAdapter(adapter2);
		
		//events
		lstPlanets.setOnItemClickListener(new OnItemClickListener()
        {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				String item= parent.getAdapter().getItem(position).toString();
				Toast.makeText(HomeActivity.this, "CLICK "+item, Toast.LENGTH_SHORT).show();
                gotoSimple(item);
				
			}
		});
		
		lstPlanets.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
				String item= parent.getAdapter().getItem(position).toString();
				Toast.makeText(HomeActivity.this,"LONG "+ item, Toast.LENGTH_LONG).show();
				return false;
			}
		});
	}

    private void gotoSimple(String item)
    {
        Intent intent= new Intent(this,SimpleActivity.class);
        intent.putExtra("DATA",item);
        startActivity(intent);
    }

    @Override
	public boolean onCreateOptionsMenu(Menu menu) {

		return false;
	}

}
