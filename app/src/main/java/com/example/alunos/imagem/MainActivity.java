package com.example.alunos.imagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     ImageView cachorro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cachorro = (ImageView) findViewById(R.id.im_cachorro);
    }
    public void onClick(View v){
        Toast.makeText(this, "Cachorro", Toast.LENGTH_LONG).show();
    }
}
