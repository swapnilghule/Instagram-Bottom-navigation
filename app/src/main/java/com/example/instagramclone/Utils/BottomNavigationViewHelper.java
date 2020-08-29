package com.example.instagramclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.instagramclone.LikesActivity;
import com.example.instagramclone.MainActivity;
import com.example.instagramclone.ProfileActivity;
import com.example.instagramclone.R;
import com.example.instagramclone.SearchActivity;
import com.example.instagramclone.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG,"Setting up navigation View");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }


    public static void enableNavigation(final Context context, BottomNavigationView view)
    {
        view.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId())
                {
                    case R.id.ic_house:
                        Intent intent1=new Intent(context, MainActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2=new Intent(context, SearchActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_circle:
                        Intent intent3=new Intent(context, ShareActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_alert:
                        Intent intent4=new Intent(context, LikesActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_android:
                        Intent intent5=new Intent(context, ProfileActivity.class);
                        context.startActivity(intent5);
                        break;

                }

                return;


            }
        });

    }


}
