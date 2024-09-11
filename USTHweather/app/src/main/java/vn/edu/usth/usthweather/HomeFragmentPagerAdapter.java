package vn.edu.usth.usthweather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT =3;
    private String titles[]= new String[] {"Hanoi", "Paris","Toulouse"};
    public HomeFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount(){
        return PAGE_COUNT; //numberofpagesforaViewPager
    }
    @Override
    public Fragment getItem(int page){
        //returnsaninstanceofFragmentcorrespondingtothespecifiedpage
        switch (page) {
            case 0: return WeatherandForecastFragment.newInstance("","");
            case 1: return WeatherandForecastFragment.newInstance("","");
            case 2: return WeatherandForecastFragment.newInstance("","");
        }
        return new Fragment(); //failsafe
    }
    @Override
    public CharSequence getPageTitle(int page){
        //returnsatabtitlecorrespondingtothespecifiedpage
        return titles[page];
    }
}
