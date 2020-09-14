package com.goldproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GalleryFragment extends Fragment {

    private RecyclerView mRvGallery;

    public static Fragment newInstance(int i) {
        Bundle args = new Bundle();
        GalleryFragment fragment = new GalleryFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        initView(view);
        setRecyclerView();
        return view;
    }

    private void setRecyclerView() {
        GalleryAdapter adapter = new GalleryAdapter(getContext());
        GridLayoutManager manager = new GridLayoutManager(getContext(), 3, GridLayoutManager.VERTICAL, false);
        mRvGallery.setLayoutManager(manager);
        mRvGallery.setAdapter(adapter);

    }

    private void initView(View view) {
        mRvGallery = view.findViewById(R.id.rv_gallery);
    }
}
