package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {
    private Context contexto ;
    private String[] equipo ;
    private int[] imagen ;
    TextView nombreEquipo ;
    ImageView escudo ;

    public Adaptador(Context contexto, String[] equipo, int[] imagen){
        this.contexto = contexto ;
        this.equipo = equipo ;
        this.imagen = imagen ;
    }
    @Override
    public int getCount(){
        return equipo.length ;
    }
    @Override
    public Object getItem(int arg0){
        return null ;
    }
    @Override
    public long getItemId(int arg0){
        return 0 ;
    }

    @Override
    public View getView(int posicion, View arg1, ViewGroup arg2){
        View item ;
        if(arg1 == null){
            LayoutInflater inflar = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
            item = new View(contexto);
            item = inflar.inflate(R.layout.item, null);
        }
        else {
            item = (View)arg1 ;
        }
        nombreEquipo = (TextView)item.findViewById(R.id.tvEquipo);
        escudo = (ImageView)item.findViewById(R.id.imgEscudo);
        nombreEquipo.setText(equipo[posicion]);
        escudo.setImageResource(imagen[posicion]);
        return item ;
    }
}