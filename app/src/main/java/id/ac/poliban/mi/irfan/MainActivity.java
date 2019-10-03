package id.ac.poliban.mi.irfan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.onClicklistener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //activity_main.xml dijadikan antarmuka oleh project android kita
        setContentView(R.layout.activity_main);

        //mengenalkan/mengkaitkan komponen(view) yang ada didalam layout
        //sehingga dikenali sebagai variable/object dalam source code java kita

        Button btFirst = findViewById(R.id.btFirst);
        Button btSecond = findViewById(R.id.btSecond);
        Button btThird = findViewById(R.id.btThird);
        Button btForth = findViewById(R.id.btForth);

    }

    @Override

    Public void onClik(View view) {
        switch (view.getId()){
            case R.id.btFirst :
                Toast.makeText(this, "Anda menekan button First", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btSecond :
                Toast.makeText(this, "Anda menekan button Second", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btThird :
                Toast.makeText(this, "Anda menekan button Third", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btForth :
                Toast.makeText(this, "Anda menekan button Forth", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
