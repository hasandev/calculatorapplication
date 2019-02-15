package dev.id.hasan.calculatorapplication;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    //Deklarasikan View / Widget
    EditText nilai_a, nilai_b;
    Button btTambah, btKurangi, btKali, btBagi;

    CoordinatorLayout rootLayoutSnackbar;

    //Deklarasikan Nilai Jumlah dengan Variable
    int total, tampung_nilai_a, tampung_nilai_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //Inisialisasi View / Widget
        nilai_a = (EditText) findViewById(R.id.etNilai_A);
        nilai_b = (EditText) findViewById(R.id.etNilai_B);

        btTambah = (Button) findViewById(R.id.btnActionTambah);
        btKurangi = (Button) findViewById(R.id.btnActionKurang);
        btKali = (Button) findViewById(R.id.btnActionKali);
        btBagi = (Button) findViewById(R.id.btnActionBagi);

        rootLayoutSnackbar = (CoordinatorLayout) findViewById(R.id.coordinatorRootLayout);

        //membuat event pada button
        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampung_nilai_a = Integer.parseInt(nilai_a.getText().toString());
                tampung_nilai_b = Integer.parseInt(nilai_b.getText().toString());

                total = tampung_nilai_a + tampung_nilai_b;

                Snackbar popup_penjumlahan = Snackbar.make(rootLayoutSnackbar, "Hasil Penjumlahan " + total, Snackbar.LENGTH_LONG);
                popup_penjumlahan.show();
            }
        });
        btKurangi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampung_nilai_a = Integer.parseInt(nilai_a.getText().toString());
                tampung_nilai_b = Integer.parseInt(nilai_b.getText().toString());

                total = tampung_nilai_a - tampung_nilai_b;

                Snackbar popup_pengurangan = Snackbar.make(rootLayoutSnackbar, "Hasil Pengurangan " + total, Snackbar.LENGTH_LONG);
                popup_pengurangan.show();
            }
        });
        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampung_nilai_a = Integer.parseInt(nilai_a.getText().toString());
                tampung_nilai_b = Integer.parseInt(nilai_b.getText().toString());

                total = tampung_nilai_a * tampung_nilai_b;

                Snackbar popup_perkalian = Snackbar.make(rootLayoutSnackbar, "Hasil Perkalian " + total, Snackbar.LENGTH_LONG);
                popup_perkalian.show();
            }
        });
        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampung_nilai_a = Integer.parseInt(nilai_a.getText().toString());
                tampung_nilai_b = Integer.parseInt(nilai_b.getText().toString());

                total = tampung_nilai_a / tampung_nilai_b;

                Snackbar popup_pembagian = Snackbar.make(rootLayoutSnackbar, "Hasil Pembagian " + total, Snackbar.LENGTH_LONG);
                popup_pembagian.show();
            }
        });
    }
}

