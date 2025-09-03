//JAVA PARA ANDROID: CONTROLLER

package com.example.aguapp;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.CheckBox;
import android.view.View;
public class AguappActivity extends Activity {
EditText edt1, edt2, edt3, edt4, edt5, edt6, edt7, edt8, edt9;
CheckBox chk1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_aguapp);
edt1 = (EditText) findViewById(R.id.editText1);
edt2 = (EditText) findViewById(R.id.editText2);
edt3 = (EditText) findViewById(R.id.editText3);
edt4 = (EditText) findViewById(R.id.editText4);
edt5 = (EditText) findViewById(R.id.editText5);
edt6 = (EditText) findViewById(R.id.editText6);
edt7 = (EditText) findViewById(R.id.editText7);
edt8 = (EditText) findViewById(R.id.editText8);
edt9 = (EditText) findViewById(R.id.editText9);
chk1= (CheckBox) findViewById(R.id.checkBox1);
}
public void calcular(View V) {
double area_jardim, con_construcao, taxa_emergencia, reserva_inf,
reserva_sup;
double reserva_incendio_sup, reserva_incendio, reserva;
int quantidade_lavanderia, total_pessoas,num_pessoas,num_carros;
int consumo_diario, num_apartamentos, num_pavimentos, lavanderia,
num_lavanderia;
consumo_diario = 200;
num_pessoas = Integer.parseInt(edt1.getText().toString());
num_apartamentos = Integer.parseInt(edt2.getText().toString());
num_pavimentos = Integer.parseInt(edt3.getText().toString());
num_carros = Integer.parseInt(edt4.getText().toString());
area_jardim = Double.parseDouble(edt5.getText().toString());
total_pessoas = (num_pessoas * num_apartamentos* num_pavimentos);
if (chk1.isChecked()) {
lavanderia = 1;
16
} else {
lavanderia = 0;
}
num_lavanderia = Integer.parseInt(edt6.getText().toString());
quantidade_lavanderia = (lavanderia * num_lavanderia);
con_construcao = (consumo_diario * total_pessoas) + (num_carros *
50) + (area_jardim * 1.5) + (quantidade_lavanderia * 80);
taxa_emergencia =(con_construcao* 2);
reserva=(taxa_emergencia*0.2)
reserva_inf = (taxa_emergencia * 0.6);
reserva_sup = (taxa_emergencia * 0.4)+reserva;
edt7.setText(String.valueOf(taxa_emergencia));
edt8.setText(String.valueOf(reserva_inf));
edt9.setText(String.valueOf(reserva_sup));
}
}


