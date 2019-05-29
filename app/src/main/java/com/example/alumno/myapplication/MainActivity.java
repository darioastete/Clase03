package com.example.alumno.myapplication;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.widget.Toast;

        import com.example.alumno.myapplication.models.XPath;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<XPath> mylistita = new ArrayList<>();


        XPath mypath = new XPath(-72.2811449,42.9268050);
        mylistita.add(mypath);


        XPath mypath1 = new XPath(-72.2799540,42.9260037);
        mylistita.add(mypath1);


        XPath mypath2 = new XPath(-72.2791278,42.9267029);
        mylistita.add(mypath2);

        XPath mypath3 = new XPath(-72.2793961,42.9275277);
        mylistita.add(mypath3);

        XPath mypath4 = new XPath(-72.2804582,42.9276848);
        mylistita.add(mypath4);

        XPath mypath5 = new XPath(-72.2811556,42.9268050);
        mylistita.add(mypath5);

        String url = "https://www.keene.edu/campus/maps/tool/?coordinates=";


        String ruta = "";



        //mesage

        Toast.makeText(this,
                String.format("hay %s elementos", mylistita.size()),
                Toast.LENGTH_LONG).show();

        //Toast.makeText(this,"hay " + mylist.size()+ " Elemntos", Toast.LENGTH_LONG).show();

        int i=1;

        for (XPath current_objet : mylistita){

            ruta += current_objet.coordenada1 + "%2C%20" + current_objet.coordenada2;

            if (i< mylistita.size()){
                ruta+= "%0A";
            }

            i++;
        }



            Log.v("dario",url+ruta);




        setContentView(R.layout.activity_main);
    }
}
