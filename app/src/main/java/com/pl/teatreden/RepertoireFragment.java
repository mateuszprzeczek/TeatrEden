package com.pl.teatreden;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class RepertoireFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView repertoireRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_repertoire, container, false);

        String[] performanceName = new String[Spectacle.performances.length];
        for (int i = 0; i < performanceName.length; i++) {
            performanceName[i] = Spectacle.performances[i].getName();
        }
        int[] performanceImages = new int[Spectacle.performances.length];
        for (int i = 0; i < performanceImages.length; i++) {
            performanceImages[i] = Spectacle.performances[i].getImageResourceId();
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(performanceName, performanceImages);
        repertoireRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 1);
        repertoireRecycler.setLayoutManager(layoutManager);
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), SpectacleDetailActivity.class);
                intent.putExtra(SpectacleDetailActivity.EXTRA_SPECTACLE_ID, position);
                getActivity().startActivity(intent);
            }
        });
        return repertoireRecycler;
    }
}