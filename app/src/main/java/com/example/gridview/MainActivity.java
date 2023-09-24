package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends Activity {
    GridView item ;
    String[] equipo, descripcion ;
    int[] imagen = {R.drawable.athletic_bilbao, R.drawable.atletico_madrid, R.drawable.barcelona, R.drawable.betis,
            R.drawable.celta_vigo, R.drawable.deportivo, R.drawable.espanyol, R.drawable.getafe,
            R.drawable.granada, R.drawable.levante, R.drawable.malaga, R.drawable.mallorca,
            R.drawable.osasuna, R.drawable.rayo_vallecano, R.drawable.real_madrid, R.drawable.real_sociedad,
            R.drawable.sevilla, R.drawable.valencia, R.drawable.valladolid, R.drawable.zaragoza
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equipo = getResources().getStringArray(R.array.equipos);
        descripcion = getResources().getStringArray(R.array.descripciones);

        Adaptador adapte = new Adaptador(this, equipo, imagen);
        item = (GridView)findViewById(R.id.gridView);
        item.setAdapter(adapte);

        item.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent i = new Intent(getApplicationContext(), Detalle.class);
                i.putExtra("descripcion", descripcion[position]);
                i.putExtra("imagen", imagen[position]);
                startActivity(i);
            }
        });
    }
}