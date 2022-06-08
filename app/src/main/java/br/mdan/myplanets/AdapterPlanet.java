package br.mdan.myplanets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterPlanet extends BaseAdapter implements InterfacePlanet {

    private final Context context;

    public AdapterPlanet(Context applicationContext) {
        context = applicationContext;
    }

    @Override
    public int getCount() { return photoPlanet.length; }

    @Override
    public Object getItem(int position) { return null; }

    @Override
    public long getItemId(int position) { return 0; }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = LayoutInflater.from(context).inflate(R.layout.model_planets_layout, parent, false);;

        ImageView imagePlanet = view.findViewById(R.id.ivPlanets);
        TextView stringPlanet = view.findViewById(R.id.tvPlanets);

        imagePlanet.setImageResource(photoPlanet[position]);
        stringPlanet.setText(textPlanet[position]);

        return view;
    }
}
