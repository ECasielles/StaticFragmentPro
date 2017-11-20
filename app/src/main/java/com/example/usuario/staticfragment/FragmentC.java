package com.example.usuario.staticfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Clase Fragment que maneja un navegador que debe restablecerse
 * al girar la pantalla
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see android.support.v4.app.Fragment
 */
public class FragmentC extends Fragment {
    private WebView wvAbout;

    public FragmentC() { }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView  = inflater.inflate(R.layout.fragmentc, container, false);
        if(rootView != null) {
            wvAbout = (WebView) rootView.findViewById(R.id.wvFrgCHtml);
            wvAbout.loadDataWithBaseURL(null,
                    getResources().getString(R.string.about),
                    "text/html", "utf-8", null);
        }
        return rootView;
    }
}
