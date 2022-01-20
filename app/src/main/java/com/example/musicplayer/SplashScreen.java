//package com.example.musicplayer;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.PersistableBundle;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.Timer;
//import java.util.TimerTask;
//
//public class SplashScreen extends AppCompatActivity {
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState, persistentState);
////        startActivity(new Intent(this,MainActivity.class));
////        new Timer().schedule(new TimerTask() {
////            @Override
////            public void run() {
////                startActivity(new Intent(getApplicationContext(),MainActivity.class));
////            }
////        },7000);
//        new Handler().postDelayed(new Runnable(){
//            public void run(){
//                Intent i = new Intent(SplashScreen.this,MainActivity.class);
//                startActivity(i);
//
//                finish();
//            }
//        },5000);
//
//    }
//
//}
