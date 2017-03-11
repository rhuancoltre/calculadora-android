package br.grupointegrado.rhuan.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    //Campos do layout
    EditText num1, num2, result;
    Button btSomar, btSubtrair, btDividir, btMultiplicar, btPorcent, btLimpar;

    //Variaveis
    Double n1, n2, resultado;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pegando os valores do usuário
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (EditText) findViewById(R.id.resultado);

        btSomar = (Button) findViewById(R.id.btSomar);
        btSubtrair = (Button) findViewById(R.id.btSubtrair);
        btDividir = (Button) findViewById(R.id.btDividir);
        btMultiplicar = (Button) findViewById(R.id.btMultiplicar);
        btPorcent = (Button) findViewById(R.id.btPorcent);
    }

    //BOTAO SOMAR
    public void soma(View v) {
        try {
            //Pegando valores do campo de texto
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            resultado = n1 + n2;
            //Passando os valores da operacao para o campo Resultado do layout
            result.setText(resultado.toString());

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Há campos em branco", Toast.LENGTH_LONG).show();
        }

    }


    //BOTAO SUBTRAIR
    public void subtrair(View v) {
        try {
            //Pegando valores do campo de texto
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            resultado = n1 - n2;
            //Passando os valores da operacao para o campo Resultado do layout
            result.setText(resultado.toString());
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Há campos em branco", Toast.LENGTH_LONG).show();
        }
    }

    //BOTAO SUBTRAIR
    public void multiplicar(View v) {
        try {
            //Pegando valores do campo de texto
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            resultado = n1 * n2;
            //Passando os valores da operacao para o campo Resultado do layout
            result.setText(resultado.toString());
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Há campos em branco", Toast.LENGTH_LONG).show();
        }
    }

    //BOTAO DIVIDIR
    public void dividir(View v) {
        try {
            //Pegando valores do campo de texto
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            resultado = n1 / n2;
            //Passando os valores da operacao para o campo Resultado do layout
            result.setText(resultado.toString());
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Há campos em branco", Toast.LENGTH_LONG).show();
        }
    }

    //BOTÃO PORCENTAGEM
    public void porcent(View v) {
        try {
            //Pegando valores do campo de texto
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            resultado = n1 * (n2 / 100);
            //Passando os valores da operacao para o campo Resultado do layout
            result.setText(resultado.toString());
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Há campos em branco", Toast.LENGTH_LONG).show();
        }
    }

    //BOTAO LIMPAR
    public void limpar(View v) {
        num1.setText("");
        num2.setText("");
        result.setText("");
        //EXIBINDO MENSAGEM NA TELA
        Toast.makeText(this, "Campos limpos", Toast.LENGTH_LONG).show();
    }
}