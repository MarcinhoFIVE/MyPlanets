package br.mdan.myplanets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterActivity adapter = new AdapterActivity(getApplicationContext());
        listView = findViewById(R.id.lvPlanets);
        listView.setAdapter(adapter);
    }

//    public class AquiAdapter extends BaseAdapter {
//
//        @Override
//        public int getCount() {
//            //return photoPlanet.length;
//            return 0;
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return null;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return 0;
//        }
//
//        @Override
//        public View getView(int position, View view, ViewGroup parent) {
//
//            view = getLayoutInflater().inflate(R.layout.model_planets_layout, null);
//
//            ImageView imagePlanet = view.findViewById(R.id.ivPlanets);
//            TextView namePlanet = view.findViewById(R.id.tvPlanets);
//
//           //imagePlanet.setImageResource(photoPlanet[position]);
//           //namePlanet.setText(textPlanet[position]);
//
//            return view;
//        }
//    }
}