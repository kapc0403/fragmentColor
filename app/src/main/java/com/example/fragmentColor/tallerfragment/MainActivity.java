package com.example.wladimir.tallerfragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements RojoActivity.OnFragmentInteractionListener, VerdeActivity.OnFragmentInteractionListener,
        NaranjaActivity.OnFragmentInteractionListener, AzulActivity.OnFragmentInteractionListener,
        AmarilloActivity.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();


        switch (item.getItemId()) {
            case R.id.rojo:
                Fragment fragment1 = getFragmentManager().findFragmentById(R.id.activity_main);
                RojoActivity rojo = new RojoActivity();
                if(fragment1 == null) {
                    transaction.add(R.id.activity_main, rojo);
                }else{
                    transaction.replace(R.id.activity_main, rojo);}
                transaction.commit();
                return true;

            case R.id.verde:
                Fragment fragment2 = getFragmentManager().findFragmentById(R.id.activity_main);
                VerdeActivity verde = new VerdeActivity();
                if(fragment2 == null) {
                    transaction.add(R.id.activity_main, verde);
                }else{
                    transaction.replace(R.id.activity_main, verde);}
                transaction.commit();
                return true;

            case R.id.naranja:
                Fragment fragment3 = getFragmentManager().findFragmentById(R.id.activity_main);
                NaranjaActivity naranja = new NaranjaActivity();
                if(fragment3 == null) {
                    transaction.add(R.id.activity_main, naranja);
                }else{
                    transaction.replace(R.id.activity_main, naranja);}
                transaction.commit();
                return true;

            case R.id.azul:
                Fragment fragment4 = getFragmentManager().findFragmentById(R.id.activity_main);
                AzulActivity azul = new AzulActivity();
                if(fragment4 == null) {
                    transaction.add(R.id.activity_main, azul);
                }else{
                    transaction.replace(R.id.activity_main, azul);}
                transaction.commit();
                return true;

            case R.id.amarillo:
                Fragment fragment5 = getFragmentManager().findFragmentById(R.id.activity_main);
                AmarilloActivity amarillo = new AmarilloActivity();
                if(fragment5 == null) {
                    transaction.add(R.id.activity_main, amarillo);
                }else{
                    transaction.replace(R.id.activity_main, amarillo);}
                transaction.commit();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }


    public void onFragmentInteraction(Uri uri) {

    }
}
