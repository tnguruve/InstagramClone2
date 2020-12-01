package com.example.instagramclone;

import android.os.Bundle;
import com.example.instagramclone.fragments.ComposedFragment;
import com.example.instagramclone.fragments.PostsFragment;
import com.example.instagramclone.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    final FragmentManager fragmentManager = getSupportFragmentManager();
              private BottomNavigationView bottomNavigationView;


        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            bottomNavigationView = findViewById(R.id.bottom_navigation);
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
                {
                    Fragment fragment;
                    switch (menuItem.getItemId()) {
                        case R.id.action_home:
                            fragment = new PostsFragment();
                            break;
                        case R.id.action_compose:
                            fragment = new ComposedFragment();
                            break;
                        case R.id.action_profile:
                        default:
                            fragment = new ProfileFragment();
                            break;
                    }
                            fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
                            return true;
                }
            });
            // Set default selection
            bottomNavigationView.setSelectedItemId(R.id.action_home);
        }
}
        
        
        
        
        
        
        
        
        

    