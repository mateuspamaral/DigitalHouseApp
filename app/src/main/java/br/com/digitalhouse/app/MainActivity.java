package br.com.digitalhouse.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = editTextEmail.getText().toString();
                String senha = editTextPassword.getText().toString();

                if (email.equals("")){
                    Toast.makeText(MainActivity.this, "Email não pode ser vazio", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (senha.length() < 6 || senha.length() > 6){
                    Toast.makeText(MainActivity.this, "Senha deve ter 6 caracteres", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (senha.equals("123456")){
                    Toast.makeText(MainActivity.this, "Ok pode passar :)", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
