package com.example.barradenavegacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnvMenu;

    BlankFragment blankFragment = new BlankFragment();
    BlankFragment2 blankFragment2 = new BlankFragment2();
    BlankFragment3 blankFragment3 = new BlankFragment3();
    BlankFragment4 blankFragment4 = new BlankFragment4();
    BlankFragment5 blankFragment5 = new BlankFragment5();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnvMenu = findViewById(R.id.bnvMenu);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2,blankFragment).commit();

        bnvMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.notificacion:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2,blankFragment2).commit();
                        break;
                    case R.id.buscar:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2,blankFragment3).commit();
                        break;
                    case R.id.configuracion:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2,blankFragment4).commit();
                        break;
                    case R.id.tendencia:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2,blankFragment5).commit();
                        break;
                }
                return true;
            }
        });


    }
}