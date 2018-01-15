package com.example.jeremy.testfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Jeremy on 19/11/2017.
 */

public class BodyPartFragment extends Fragment {

    public BodyPartFragment(){

    }
   
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View rootView=inflater.inflate(R.layout.fragment_head,container,false);
        ImageView imageView=(ImageView)rootView.findViewById(R.id.head1_png);
        //imageView.setImageResource(R.drawable.head1);
        return  rootView;
    }
}
