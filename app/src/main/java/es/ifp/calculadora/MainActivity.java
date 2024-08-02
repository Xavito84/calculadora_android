package es.ifp.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected TextView label1;
    protected TextView label2;
    protected EditText caja1;
    protected EditText caja2;
    protected Button boton1;
    protected Button boton2;
    protected Button boton3;
    protected Button boton4;

    //crear String por cada caja de texto
    private String contenidoCaja1 = "";
    private String contenidoCaja2 = "";

    private float op1 = 0.0f;
    private float op2 = 0.0f;
    private float res = 0.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciar
        label1 = (TextView) findViewById(R.id.label1_start);
        label2 = (TextView) findViewById(R.id.label2_start);
        caja1 = (EditText) findViewById(R.id.caja1_start);
        caja2 = (EditText) findViewById(R.id.caja2_start);
        boton1 = (Button) findViewById(R.id.boton1_start);
        boton2 = (Button) findViewById(R.id.boton2_start);
        boton3 = (Button) findViewById(R.id.boton3_start);
        boton4 = (Button) findViewById(R.id.boton4_start);

        //crear eventos
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    op1 = Float.parseFloat(contenidoCaja1);
                    op2 = Float.parseFloat(contenidoCaja2);
                    res = op1 + op2;
                    label2.setText(Float.toString(res));
                } catch (Exception e) {
                    label2.setText("Error las cajas deben ser numericas");
                }

            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    op1 = Float.parseFloat(contenidoCaja1);
                    op2 = Float.parseFloat(contenidoCaja2);
                    if (op2 == 0f) {
                        label2.setText("El segundo valor de la operacion no puede ser 0");
                    } else {
                        res = op1 - op2;
                        label2.setText(Float.toString(res));
                    }

                } catch (Exception e) {
                    label2.setText("Error las cajas deben ser numericas");
                }

            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    op1 = Float.parseFloat(contenidoCaja1);
                    op2 = Float.parseFloat(contenidoCaja2);
                    res = op1 * op2;
                    label2.setText(Float.toString(res));
                } catch (Exception e) {
                    label2.setText("Error las cajas deben ser numericas");
                }

            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    op1 = Float.parseFloat(contenidoCaja1);
                    op2 = Float.parseFloat(contenidoCaja2);
                    res = op1 / op2;
                    label2.setText(Float.toString(res));
                } catch (Exception e) {
                    label2.setText("Error ");
                    Toast.makeText(MainActivity.this, "El valor debe ser numerico", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}