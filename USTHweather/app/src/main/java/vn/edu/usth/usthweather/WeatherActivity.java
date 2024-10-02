package vn.edu.usth.usthweather;


import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather); // Make sure to set the correct layout

        AsyncTask<String, Integer, Bitmap> task = new AsyncTask<String, Integer, Bitmap>() {
            @Override
            protected void onPreExecute() {
                // Do some preparation here, if needed
            }

            @Override
            protected Bitmap doInBackground(String... params) {
                // Worker thread's code
                return null;
            }

            @Override
            protected void onProgressUpdate(Integer... values) {
                // Update UI to reflect progress
            }

            @Override
            protected void onPostExecute(Bitmap bitmap) {
                // Set bitmap to ImageView
            }
        };
        task.execute("");

        HomeFragmentPagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);

        WeatherFragment secondFragment = new WeatherFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main, secondFragment).commit();

        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main, firstFragment).commit();

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_layout, menu);
        return true;
    }
    //@Override
    //public boolean onOptionsItemSelected(MenuItem item) {
    //    int itemId = item.getItemId();
    //    if(itemId == R.id.action_favorite){
    //        Toast.makeText(this, "Refreshing", Toast.LENGTH_SHORT).show();
    //        return true;
    ////    }else if (itemId == R.id.action_settings){
    //        Toast.makeText(this, "Settings hehe", Toast.LENGTH_SHORT).show();
    //        return true;
    //    }
    //    return super.onOptionsItemSelected(item);
    //}


}