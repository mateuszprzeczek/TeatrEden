package com.pl.teatreden;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class ContactFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView contactRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_ofice_workers, container, false);
        String[] workersNames = new String[OfficeWorker.OFFICE_WORKERS.length];
        for (int i = 0; i < workersNames.length; i++) {
            workersNames[i] = OfficeWorker.OFFICE_WORKERS[i].getName();
        }
        int[] workersImages = new int[OfficeWorker.OFFICE_WORKERS.length];
        for (int i = 0; i < workersImages.length; i++) {
            workersImages[i] = OfficeWorker.OFFICE_WORKERS[i].imageResourceId;
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(workersNames, workersImages);
        contactRecycler.setAdapter(adapter);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        contactRecycler.setLayoutManager(layoutManager);
        return contactRecycler;
    }
}
