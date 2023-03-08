package br.com.uniritter.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        Button button_entrar = findViewById(R.id.button_entrar);
        button_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText input1 = (EditText) findViewById(R.id.editTextTextPersonName);
                EditText input2 = (EditText) findViewById(R.id.editTextTextPassword);

                String user = input1.getText().toString();
                String password = input2.getText().toString();

                if(user.equals("admin") && password.equals("admin")){
                    Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}