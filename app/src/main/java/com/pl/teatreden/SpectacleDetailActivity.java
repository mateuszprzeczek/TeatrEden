package com.pl.teatreden;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SpectacleDetailActivity extends AppCompatActivity {
    public static final String EXTRA_SPECTACLE_ID = "spectacleId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spectacle_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int spectacle_id = (Integer)getIntent().getExtras().get(EXTRA_SPECTACLE_ID);

        String spectacleName = Spectacle.performances[spectacle_id].getName();
        TextView title = (TextView) findViewById(R.id.title_spectacle_detail);
        title.setText(spectacleName);
        int spectacleDescription = Spectacle.performances[spectacle_id].getDescription();
        TextView description = (TextView) findViewById(R.id.description_spectacle_detail);
        description.setText(spectacleDescription);
        int spectacleImage = Spectacle.performances[spectacle_id].getImageResourceId();
        ImageView imageView = (ImageView) findViewById(R.id.spectacle_image_detail);
        imageView.setContentDescription(spectacleName);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, spectacleImage));

    }
}
