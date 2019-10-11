package com.ums.upos.apk;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //启动有图标的APK
      /*  Intent intent = getPackageManager().getLaunchIntentForPackage("com.szzt.advert");

        if(intent!=null){
            startActivity(intent);
        }*/
      //启动隐藏图标的APK
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setComponent(new ComponentName("com.szzt.advert",
                "com.szzt.advert.MainActivity"));
        startActivity(intent);
    }
}
