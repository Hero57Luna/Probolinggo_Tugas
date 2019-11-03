package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.Adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.Models.SuperHero;

public class MainActivity extends AppCompatActivity {

    //Instansiasi RecyclerView
    RecyclerView rvSuperHero;
    // list superhero
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //rvSupeerhero ke layout
        rvSuperHero = findViewById(R.id.rvSuperHero);

        //Membuat Object Superhero
        SuperHero hero = new SuperHero("Petruk");

        //menambahkan hero ke listSupperhero
        listSuperHero.add(hero);
        hero = new SuperHero("Gareng");
        listSuperHero.add(hero);
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
