package com.goldproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MCXFragment extends Fragment {

    public static Fragment newInstance(int i) {
        Bundle args = new Bundle();
        MCXFragment fragment = new MCXFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mcx, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {

    }
}
