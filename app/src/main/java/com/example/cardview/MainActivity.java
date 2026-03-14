package com.example.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView schoolCardView,restaurantCardView,airportcardView,hospitaCardView,busstopCardView,hotelCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        schoolCardView=(CardView) findViewById(R.id.schoolId);
        restaurantCardView=(CardView) findViewById(R.id.restaurantId);
        airportcardView=(CardView) findViewById(R.id.airportId);
        hospitaCardView=(CardView)findViewById(R.id.hospitalId) ;
        busstopCardView=(CardView)findViewById(R.id.busstopId) ;
        hotelCardView=(CardView)findViewById(R.id.hotelId);

        schoolCardView.setOnClickListener(this);
        restaurantCardView.setOnClickListener(this);
        hospitaCardView.setOnClickListener(this);
        airportcardView.setOnClickListener(this);
        hotelCardView.setOnClickListener(this);
        busstopCardView.setOnClickListener(this);
        hotelCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.schoolId)
        {
            Intent intent=new Intent(MainActivity.this,schoolActivity.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.restaurantId)
        {
            Intent intent=new Intent(MainActivity.this,restaurantActivity.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.airportId)
        {
            Intent intent=new Intent(MainActivity.this,airportActivity.class);
            startActivity(intent);
        }


        if(view.getId()==R.id.hospitalId)
        {
            Intent intent=new Intent(MainActivity.this,hospitalActivity.class);
            startActivity(intent);
        }


        if(view.getId()==R.id.busstopId)
        {
            Intent intent=new Intent(MainActivity.this,busstopActivity.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.hotelId)
        {
            Intent intent=new Intent(MainActivity.this,hotelActivity.class);
            startActivity(intent);
        }
    }
}