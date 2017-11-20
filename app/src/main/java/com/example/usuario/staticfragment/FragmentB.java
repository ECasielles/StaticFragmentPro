package com.example.usuario.staticfragment;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Clase Fragment que maneja un texto que ocupa toda la pantalla
 * y debe restablecerse al girarla
 *
 * @author  Enrique Casielles Lapeira
 * @version 1.0
 * @see android.app.Fragment
 */
public class FragmentB extends Fragment {
    private TextView txvFragmentB;

    public FragmentB() { }

    @Override
    public void onAttach(Activity activity) {
        Log.d("FragmentB", "onAttach()");
        super.onAttach(activity);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("FragmentB", "onCreate()");
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("FragmentB", "onCreateView()");
        View rootView = inflater.inflate(R.layout.fragmentb, container, false);
        //Comprobación muy útil. La vista lo ha inflado ya y nos lo da.
        if (rootView != null)
            txvFragmentB = (TextView) rootView.findViewById(R.id.txvTexto);
        return rootView;
    }
    public void changeTextProperties(String message, int size){
        txvFragmentB.setTextSize(size);
        txvFragmentB.setText(message);
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.d("FragmentB", "onSavedInscanceState()");
        super.onSaveInstanceState(outState);
        outState.putString("message", txvFragmentB.getText().toString());
        outState.putFloat("size", txvFragmentB.getTextSize());
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("FragmentB", "onActivityCreated()");
        super.onActivityCreated(savedInstanceState);
        if(savedInstanceState != null){
            txvFragmentB.setText(savedInstanceState.getString("message"));
            txvFragmentB.setTextSize(savedInstanceState.getFloat("size"));
        }
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Log.d("FragmentB", "onViewCreated()");
        super.onViewCreated(view, savedInstanceState);
    }
    @Override
    public void onStart() {
        Log.d("FragmentB", "onStart()");
        super.onStart();
    }
    @Override
    public void onResume() {
        Log.d("FragmentB", "onResume()");
        super.onResume();
    }
    @Override
    public void onPause() {
        Log.d("FragmentB", "onPause()");
        super.onPause();
    }
    @Override
    public void onStop() {
        Log.d("FragmentB", "onStop()");
        super.onStop();
    }
    @Override
    public void onDestroyView() {
        Log.d("FragmentB", "onDestroyView()");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("FragmentB", "onDestroy()");
        super.onDestroy();
    }
    @Override
    public void onDetach() {
        Log.d("FragmentB", "onDetach");
        super.onDetach();
    }

}
