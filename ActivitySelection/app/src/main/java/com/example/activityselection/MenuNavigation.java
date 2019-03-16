package com.example.activityselection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuNavigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_navigation);
        openHome();
        openResume();
        openPlay();
        openSettings();
        openLogout();

    }

}

    public void openResumeIntent(){
        Intent intent = new Intent (this, Resume.class);
        startActivity(intent);
    }

    public void openPlayIntent(){
        Intent intent = new Intent (this, Play.class);
        startActivity(intent);
    }

    public void openSettingsIntent(){
        Intent intent = new Intent (this, Settings.class);
        startActivity(intent);
    }

    public void openLogoutIntent(){
        Intent intent = new Intent (this, Logout.class);
        startActivity(intent);
    }

    public void openHomeIntent(){
        Intent intent = new Intent (this, Home.class);
        startActivity(intent);
    }

    public void openHome(){
      Home.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClickView(View v){
              openHomeIntent();
          }
      }
    }

    public void openResume(){
        Resume.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClickView(View v){
                openResumeIntent();
            }
        }
    }

    public void openPlay(){
        Play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClickView(View v){
                openPlayIntent();
            }
        }
    }

    public void openSettings(){
        Home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClickView(View v){
                openSettingsIntent();
            }
        }
    }

    public void openLogout(){
        Home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClickView(View v){
                openLogoutIntent();
            }
        }
    }
}


