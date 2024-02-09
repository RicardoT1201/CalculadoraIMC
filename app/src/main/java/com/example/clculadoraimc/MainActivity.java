package com.example.clculadoraimc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber;
    EditText editTextNumber2;
    EditText editTextNumber3;
    EditText editTextNumber4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editTextNumber3 = findViewById(R.id.editTextNumber3);
        editTextNumber4 = findViewById(R.id.editTextNumber4);
    }
    public void imc(View vista){
        String numero1 = editTextNumber.getText().toString();
        String numero2 = editTextNumber2.getText().toString();
        String numero3 = editTextNumber3.getText().toString();
        String numero4 = editTextNumber4.getText().toString();
        if (numero1.equals("")||numero2.equals("")||numero3.equals("")||numero4.equals("")){
            Toast.makeText(getApplicationContext(),"Por favor rellenar los datos",Toast.LENGTH_LONG).show();
        }else{
            int editTextNumber = Integer.parseInt(numero1);
            float editTextNumber2 = Float.parseFloat(numero2);
            float editTextNumber3 = Float.parseFloat(numero3);
            float editTextNumber4 = Float.parseFloat(numero4);
            numero3= numero3/100;
            float imc=numero2/(float)Math.pow(numero3,2);
            String imcTexto = String.format("%.1f",imc);
            if (imc < 18.5f)
                Toast.makeText(getApplicationContext(),"Su edad es de: "+ numero1 + "y su indice de masa corporal es de: " +imcTexto+ "Tienes desnutrición", Toast.LENGTH_LONG).show();
            if (imc >= 18.5f && imc < 25)
                Toast.makeText(getApplicationContext(),"Su edad es de: "+ numero1 + "y su indice de masa corporal es de: " +imcTexto+ "Tienes un peso adecuado", Toast.LENGTH_LONG).show();
            if (imc >= 25 && imc < 30)
                Toast.makeText(getApplicationContext(),"Su edad es de: "+ numero1 + "y su indice de masa corporal es de: " +imcTexto+ "Tienes sobrepeso", Toast.LENGTH_LONG).show();
            if (imc >= 30 && imc < 35 )
                Toast.makeText(getApplicationContext(),"Su edad es de: "+ numero1 + "y su indice de masa corporal es de: " +imcTexto+ "Obesidad de grado 1", Toast.LENGTH_LONG).show();
            if (imc >= 35 && imc < 40)
                Toast.makeText(getApplicationContext(),"Su edad es de: "+ numero1 + "y su indice de masa corporal es de: " +imcTexto+ "Obesidad de grado 2", Toast.LENGTH_LONG).show();
            if (imc >= 40)
                Toast.makeText(getApplicationContext(),"Su edad es de: "+ numero1 + "y su indice de masa corporal es de: " +imcTexto+ "Obesidad de grado 3", Toast.LENGTH_LONG).show();



        }
    }
}
