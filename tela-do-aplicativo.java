//JAVA PARA ANDROID: TELA DO APLICATIVO

<LinearLayout xmlns:tools="http://schemas.android.com/tools"
xmlns:android="http://schemas.android.com/apk/res/android"
android:id="@+id/LinearLayout1"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
tools:context="${relativePackage}.${activityClass}" >
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content" >
<TextView
android:id="@+id/textView1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
11
android:text="N° de residentes+empregado(a)" />
<EditText
android:id="@+id/editText1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_weight="1"
android:ems="10"
android:inputType="numberSigned" />
</LinearLayout>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content" >
<TextView
android:id="@+id/textView2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="N° de apartamentos por andar" />
<EditText
android:id="@+id/editText2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_weight="1"
android:ems="10"
android:inputType="numberSigned" />
</LinearLayout>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content" >
<TextView
android:id="@+id/textView3"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="A construção tem quantos andares?" />
<EditText
android:id="@+id/editText3"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_weight="1"
android:ems="10"
android:inputType="numberSigned" />
</LinearLayout>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content" >
<TextView
android:id="@+id/textView4"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
12
android:text="N° de vagas na garagem" />
<EditText
android:id="@+id/editText4"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_weight="1"
android:ems="10"
android:inputType="numberSigned" />
</LinearLayout>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content" >
<TextView
android:id="@+id/textView5"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Área total do jardim em m²" />
<EditText
android:id="@+id/editText5"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_weight="1"
android:ems="10"
android:inputType="numberDecimal" />
</LinearLayout>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content" >
<TextView
android:id="@+id/textView6"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Possui lavanderia?" />
<CheckBox
android:id="@+id/checkBox1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Sim" />
</LinearLayout>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content" >
<TextView
android:id="@+id/textView7"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Quantas lavanderias existem na construção?" />
13
<EditText
android:id="@+id/editText6"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_weight="1"
android:ems="10"
android:inputType="numberSigned" />
</LinearLayout>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content" >
<Button
android:id="@+id/button1"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:onClick="calcular"
android:text="Calcular" />
</LinearLayout>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content" >
<TextView
android:id="@+id/textView9"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Consumo Total" />
<EditText
android:id="@+id/editText7"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_weight="1"
android:ems="10"
android:inputType="numberDecimal" />
</LinearLayout>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content" >
<TextView
android:id="@+id/textView10"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Reservatório Inferior em Litros" />
<EditText
android:id="@+id/editText8"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_weight="1"
android:ems="10"
android:inputType="numberDecimal" />
14
</LinearLayout>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content" >
<TextView
android:id="@+id/textView11"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Reservatório Superior em Litros" />
<EditText
android:id="@+id/editText9"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_weight="1"
android:ems="10"
android:inputType="numberDecimal" />
</LinearLayout>
</LinearLayout>