package edu.unaj.covidmotivation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MapPictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_picture);
        ImageView mapPicture = findViewById(R.id.mapPictureTaken);

        String imagePath = getIntent().getStringExtra("mapPictureRef");
        File f = new File(imagePath);
        try {
            Bitmap picture = BitmapFactory.decodeStream(new FileInputStream(f));
            mapPicture.setImageBitmap(picture);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
