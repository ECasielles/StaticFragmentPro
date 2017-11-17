package com.example.usuario.staticfragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Clase principal de fragment.
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see android.app.Activity
 * @see com.example.usuario.staticfragment.FragmentB
 */
public class MainActivity extends AppCompatActivity implements FragmentA.FragmentAListener{

    //private FragmentA fragmentA;
    private FragmentB fragmentB;
    //private FragmentC fragmentC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragmentA = (FragmentA) getSupportFragmentManager().findFragmentById(R.id.fragmentA);
        fragmentB = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragmentB);
        //fragmentC = (FragmentC) getSupportFragmentManager().findFragmentById(R.id.fragmentC);
    }

    @Override
    public void onFragmentChangedListener(String mensaje, int size) {
        fragmentB.changeTextProperties(mensaje, size);
    }
}
