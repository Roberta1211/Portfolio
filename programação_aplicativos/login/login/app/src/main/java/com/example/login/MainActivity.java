package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Repositorio r = new Repositorio();
    EditText l;
    EditText s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criaUsuariosIniciais();
        l = (EditText) findViewById(R.id.l);
        s = (EditText) findViewById(R.id.s);

    }
    public void criaUsuariosIniciais(){
        r.usuarios.add(new Usuario("aaa","123"));
        r.usuarios.add(new Usuario("bbb","123"));
        r.usuarios.add(new Usuario("ccc","123"));
        r.usuarios.add(new Usuario("ddd","123"));
    }
}