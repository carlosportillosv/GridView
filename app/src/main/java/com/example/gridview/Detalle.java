package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        TextView descripcion = (TextView)findViewById(R.id.tvDescripcion);
        ImageView imagen = (ImageView)findViewById(R.id.imgDetalle);
        Button regresar = (Button)findViewById(R.id.btnVolver);

        String detalle ;
        int img ;

        Bundle b = getIntent().getExtras();

        detalle = b.getString("descripcion");
        img = b.getInt("imagen");

        descripcion.setText(detalle);
        imagen.setImageResource(img);

        regresar.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v){
                finish();
            }
        });
    }
}