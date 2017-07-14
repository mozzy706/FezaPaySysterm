package com.fezapay.moses.fezapay;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.content.Intent;

public class Login extends AppCompatActivity {
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Login = (Button) findViewById(R.id.btnLogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });
    }
        private void launchActivity() {




            Intent intent = new Intent(this, FezaMenu.class);
            startActivity(intent);
        }

    }

