package com.example.liuzhenhui.fingerscore;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.scorelibrary.chord.components.ChordTextureView;
import com.example.scorelibrary.chord.helper.DrawHelper;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ChordTextureView chordView;
    private TextView txtHandPosition;
    int position = 0; // fret position index (0 to 12)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.image_view);
        chordView = (ChordTextureView) findViewById(R.id.chord_texture_view);
        txtHandPosition = (TextView) findViewById(R.id.txt_hand_position);

        drawChords();

        findViewById(R.id.btn_increase).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position < 8) {
                    position++;
                    drawChords();
                }
            }
        });
        findViewById(R.id.btn_decrease).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position > 0) {
                    position--;
                    drawChords();
                }
            }
        });
    }

    private void drawChords() {
        /**
         * Set to ImageView
         */


        // Prepare data
        Resources resources = this.getResources();
        int width = 200;
        int height = 200;
        String chordName = "Am";
        int transpose = 0; // transpose distance (-12 to 12)

        // Draw chord
        BitmapDrawable chord = DrawHelper.getBitmapDrawable(
                resources, width, height, chordName, position, transpose);

        // Display chord to your image view
        imageView.setImageDrawable(chord);

        /**
         * Use ChordTextureView
         */

        chordView.drawChord("C#", position);

        /**
         * Update view
         */
        txtHandPosition.setText(position + "");

    }
}
