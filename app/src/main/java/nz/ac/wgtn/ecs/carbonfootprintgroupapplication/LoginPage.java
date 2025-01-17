package nz.ac.wgtn.ecs.carbonfootprintgroupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    private EditText emailAddress;
    private EditText password;
    private TextView tvError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        emailAddress = findViewById(R.id.emailAddress);
        password = findViewById(R.id.password);
    }

    public void loginButtonClick(View view){
        String emailAdd = emailAddress.getText().toString();
        String pwd = password.getText().toString();

        if(emailAdd.equals("admin") && pwd.equals("123")){
            Intent intent = new Intent(this, MenuPage.class);
            startActivity(intent);
        }else{
            tvError.setText("Your password or username is invalid");
        }

    }
}