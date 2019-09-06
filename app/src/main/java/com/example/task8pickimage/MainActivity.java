package com.example.task8pickimage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button changeimg;
    public static final int SELECT_PICTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.img);
        changeimg = (Button) findViewById(R.id.btnchange);


        changeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent pick = new Intent();
                pick.setType("image/*");
                pick.setAction(Intent.ACTION_GET_CONTENT);
                String pickTitle = "Select or take a new pic";
                Intent chooserIntent = Intent.createChooser(pick, pickTitle);
                startActivityForResult(chooserIntent, SELECT_PICTURE);

//                final Intent galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
//                galleryIntent.setType("*/*");
//                startActivityForResult(galleryIntent,SELECT_PICTURE);


            }
        });






    }

}
