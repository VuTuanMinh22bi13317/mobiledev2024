package vn.edu.usth.usthweather;


import android.os.Bundle;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);

        HomeFragmentPagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);

        //WeatherFragment secondFragment = new WeatherFragment();
        //getSupportFragmentManager().beginTransaction().add(
        //R.id.main, secondFragment).commit();

        //ForecastFragment firstFragment = new ForecastFragment();
        //getSupportFragmentManager().beginTransaction().add(
        //        R.id.main, firstFragment).commit();

        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        //    return insets;
       // });
        TabLayout tabLayout =(TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather",  "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather",  "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather",  "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather",  "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather",  "onDestroy");
    }


}