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

    private FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentB = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragmentB);
    }

    @Override
    public void onFragmentAEvent(String mensaje, int size) {
        ((FragmentB)fragmentB).changeTextProperties(mensaje, size);
    }
}
