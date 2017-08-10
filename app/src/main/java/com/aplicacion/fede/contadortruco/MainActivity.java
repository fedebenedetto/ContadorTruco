package com.aplicacion.fede.contadortruco;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int marcadorNos = 0;
    int marcadorEll = 0;

    TextView tv_mNos;
    TextView tv_mEll;
    Button btnSumNos;
    Button btnResNos;

    Button btnEnvNos;
    Button btnRealNos;
    Button btnFaltaNos;
    Button btnTrucoNos;
    Button btnReTNos;
    Button btnValeNos;
    Button btnPuntoNos;

    Button btnSumEll;
    Button btnResEll;
    Button btnEnvEll;
    Button btnRealEll;
    Button btnFaltaEll;
    Button btnTrucoEll;
    Button btnReTEll;
    Button btnValeEll;
    Button btnPuntoEll;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSumNos = (Button) findViewById(R.id.btn_sumNos);
        btnResNos = (Button) findViewById(R.id.btn_resNos);
        btnEnvNos = (Button) findViewById(R.id.btn_envNos);
        btnRealNos = (Button) findViewById(R.id.btn_realNos);
        btnFaltaNos = (Button) findViewById(R.id.btn_falNos);
        btnTrucoNos = (Button) findViewById(R.id.btn_trNos);
        btnReTNos = (Button) findViewById(R.id.btn_retrNos);
        btnValeNos = (Button) findViewById(R.id.btn_valeNos);
        btnPuntoNos = (Button) findViewById(R.id.btn_puntoNos);

        btnSumEll = (Button) findViewById(R.id.btn_sumEll);
        btnResEll = (Button) findViewById(R.id.btn_resEll);
        btnEnvEll = (Button) findViewById(R.id.btn_envEll);
        btnRealEll = (Button) findViewById(R.id.btn_realEll);
        btnFaltaEll = (Button) findViewById(R.id.btn_falEll);
        btnTrucoEll = (Button) findViewById(R.id.btn_trEll);
        btnReTEll = (Button) findViewById(R.id.btn_retrEll);
        btnValeEll = (Button) findViewById(R.id.btn_valeEll);
        btnPuntoEll = (Button) findViewById(R.id.btn_puntoEll);

        btnReset = (Button) findViewById(R.id.btn_reset);

        btnSumNos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorNos = marcadorNos + 1;
                nosMarcador(marcadorNos);
            }
        });

        btnResNos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorNos = marcadorNos - 1;
                nosMarcador(marcadorNos);
            }
        });

        btnEnvNos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorNos = marcadorNos + 2;
                nosMarcador(marcadorNos);
            }
        });

        btnRealNos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorNos = marcadorNos + 3;
            }
        });

        btnFaltaNos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorNos = 30 - marcadorEll;
                nosMarcador(marcadorNos);
            }
        });

        btnTrucoNos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorNos = marcadorNos + 2;
                nosMarcador(marcadorNos);
            }
        });

        btnReTNos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorNos = marcadorNos + 3;
                nosMarcador(marcadorNos);
            }
        });

        btnValeNos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorNos = marcadorNos + 4;
                nosMarcador(marcadorNos);
            }
        });

        btnPuntoNos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorNos = marcadorNos + 1;
                nosMarcador(marcadorNos);
            }
        });

        btnSumEll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorEll = marcadorEll + 1;
                ellMarcador(marcadorEll);
            }
        });

        btnResEll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorEll = marcadorEll - 1;
                ellMarcador(marcadorEll);
            }
        });

        btnEnvEll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorEll = marcadorEll + 2;
                ellMarcador(marcadorEll);
            }
        });

        btnRealEll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorEll = marcadorEll + 3;
                ellMarcador(marcadorEll);
            }
        });

        btnFaltaEll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorEll = 30 - marcadorNos;
                ellMarcador(marcadorEll);
            }
        });

        btnTrucoEll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorEll = marcadorEll + 2;
                ellMarcador(marcadorEll);
            }
        });

        btnReTEll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorEll = marcadorEll + 3;
                ellMarcador(marcadorEll);
            }
        });

        btnValeEll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorEll = marcadorEll + 4;
                ellMarcador(marcadorEll);
            }
        });

        btnPuntoEll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorEll = marcadorEll + 1;
                ellMarcador(marcadorEll);
            }
        });

        btnResNos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marcadorEll = marcadorEll + 1;
                ellMarcador(marcadorEll);
            }
        });
    }

    protected void nosMarcador(int value) {
        marcadorNos += value;
        if (marcadorNos < 0) {
            marcadorNos = 0;
        }
        if (marcadorNos > 30) {
            Alert("Ganamos!!!");
            return;
        }
        tv_mNos.setText(Integer.toString(marcadorNos));
    }


    protected void ellMarcador(int value) {
        marcadorEll += value;
        if (marcadorEll < 0) {
            marcadorEll = 0;
        }
        if (marcadorEll > 30) {
            Alert("Ganaron :(");
            return;
        }
        tv_mEll.setText(Integer.toString(marcadorEll));
    }

    private void Alert(String mensaje) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage(mensaje);
        alertDialog.show();
    }
}
