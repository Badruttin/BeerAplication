package ru.mkala.beeraplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    TextView brands;
    Spinner color;
    private BeerExpert expert = new BeerExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickFindBeer(View view){
        brands = (TextView)findViewById(R.id.brands);
        color = (Spinner)findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());

        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormated = new StringBuilder();
        for (String brand : brandList){
            brandsFormated.append(brand).append('\n');
        }
        brands.setText(brandsFormated);
    }

    public void onSendMessage(View view){
        EditText messa=(EditText) findViewById(R.id.mess);
        String mess = messa.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, mess);
        startActivity(intent);

    }
}
