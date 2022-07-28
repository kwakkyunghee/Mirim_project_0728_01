package kr.hs.emirims2117.mirim_project_0728_01;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {
    RatingBar small, medium, basic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        small = findViewById(R.id.rating_small);
        medium = findViewById(R.id.rating_medium);
        basic = findViewById(R.id.rating_basic);

        Button btnInc = findViewById(R.id.btn_inc);
        Button btnDec = findViewById(R.id.btn_dec);
        btnInc.setOnClickListener(btnListener);
        btnDec.setOnClickListener(btnListener);

    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_inc:
                    small.setRating(small.getRating()+small.getStepSize());
                    medium.setRating(medium.getRating()+medium.getStepSize());
                    basic.setRating(basic.getRating()+basic.getStepSize());
                    break;
                case R.id.btn_dec:
                    small.setRating(small.getRating()-small.getStepSize());
                    medium.setRating(medium.getRating()-medium.getStepSize());
                    basic.setRating(basic.getRating()-basic.getStepSize());
                    break;
            }
        }
    };
}