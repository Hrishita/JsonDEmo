package com.example.hrishitamavani.jsontask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class Main4Activity extends AppCompatActivity {
    String dd="{\"Bridal\":{\"Lehanga\":{\"color\":\"Sample Konfabulator Widget\",\"size\":\"main_window\",\"prize\":500,\"discount\":500}}}\n";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        TextView txt = (TextView) findViewById(R.id.txt);
        ImageView im = (ImageView) findViewById(R.id.image);
        TextView txname = (TextView) findViewById(R.id.txname);
        TextView txsize = (TextView) findViewById(R.id.txsize);
        TextView txprize = (TextView) findViewById(R.id.txprize);
        TextView txdiscount = (TextView) findViewById(R.id.txdiscount);


        Intent i = getIntent();
        int img = i.getIntExtra("pos", -1);

            if (img == 0) {
               txt.setText("Manyavar");
                try {
                    JSONObject root = new JSONObject(dd);
                    JSONObject brdl = root.getJSONObject("Bridal");
                    JSONObject lhng = brdl.getJSONObject("Lehanga");
                    String lcolor = lhng.getString("color");
                    Log.d("test1", String.valueOf(root));
                    txname.setText(lcolor);
                    String lsize = lhng.getString("size");
                    Log.d("test", String.valueOf(lsize));
                    txsize.setText(lsize);
                    String lprize = lhng.getString("prize");
                    Log.d("test", String.valueOf(lprize));
                    txprize.setText(lprize);
                    String ldiscount = lhng.getString("discount");
                    Log.d("test", String.valueOf(ldiscount));
                    txdiscount.setText(ldiscount);


                } catch (JSONException e)

                {
                    e.printStackTrace();
                }
                im.setImageResource(R.drawable.bridalclothes2);

            } else if (img == 1) {
                txt.setText("Biba");
                im.setImageResource(R.drawable.bridalclothes4);
                try {
                    JSONObject root = new JSONObject(dd);
                    JSONObject brdl = root.getJSONObject("Bridal");
                    JSONObject lhng = brdl.getJSONObject("Lehanga");
                    String lcolor = lhng.getString("color");
                    Log.d("test", String.valueOf(lcolor));
                    txname.setText(lcolor);
                    String lsize = lhng.getString("size");
                    Log.d("test", String.valueOf(lsize));
                    txsize.setText(lsize);
                    String lprize = lhng.getString("prize");
                    Log.d("test", String.valueOf(lprize));
                    txprize.setText(lprize);
                    String ldiscount = lhng.getString("discount");
                    Log.d("test", String.valueOf(ldiscount));
                    txdiscount.setText(ldiscount);


                } catch (JSONException e)

                {
                    e.printStackTrace();
                }

            } else if (img == 2) {
                txt.setText("Juliana");
                im.setImageResource(R.drawable.bridalclothes5);
                try {
                    JSONObject root = new JSONObject(dd);
                    JSONObject brdl = root.getJSONObject("Bridal");
                    JSONObject lhng = brdl.getJSONObject("Lehanga");
                    String lcolor = lhng.getString("color");
                    Log.d("test", String.valueOf(lcolor));
                    txname.setText(lcolor);
                    String lsize = lhng.getString("size");
                    Log.d("test", String.valueOf(lsize));
                    txsize.setText(lsize);
                    String lprize = lhng.getString("prize");
                    Log.d("test", String.valueOf(lprize));
                    txprize.setText(lprize);
                    String ldiscount = lhng.getString("discount");
                    Log.d("test", String.valueOf(ldiscount));
                    txdiscount.setText(ldiscount);


                } catch (JSONException e)

                {
                    e.printStackTrace();
                }

            } else if (img == 3) {
                txt.setText("Global desi");
                im.setImageResource(R.drawable.bridalclothes6);
                try {
                    JSONObject root = new JSONObject(dd);
                    JSONObject brdl = root.getJSONObject("Bridal");
                    JSONObject lhng = brdl.getJSONObject("Lehanga");
                    String lcolor = lhng.getString("color");
                    Log.d("test", String.valueOf(lcolor));
                    txname.setText(lcolor);
                    String lsize = lhng.getString("size");
                    Log.d("test", String.valueOf(lsize));
                    txsize.setText(lsize);
                    String lprize = lhng.getString("prize");
                    Log.d("test", String.valueOf(lprize));
                    txprize.setText(lprize);
                    String ldiscount = lhng.getString("discount");
                    Log.d("test", String.valueOf(ldiscount));
                    txdiscount.setText(ldiscount);


                } catch (JSONException e)

                {
                    e.printStackTrace();
                }
            } else if (img == 4) {
                txt.setText("Tommy Anderson");
                im.setImageResource(R.drawable.bridalclothes8);
                try {
                    JSONObject root = new JSONObject(dd);
                    JSONObject brdl = root.getJSONObject("Bridal");
                    JSONObject lhng = brdl.getJSONObject("Lehanga");
                    String lcolor = lhng.getString("color");
                    Log.d("test", String.valueOf(lcolor));
                    txname.setText(lcolor);
                    String lsize = lhng.getString("size");
                    Log.d("test", String.valueOf(lsize));
                    txsize.setText(lsize);
                    String lprize = lhng.getString("prize");
                    Log.d("test", String.valueOf(lprize));
                    txprize.setText(lprize);
                    String ldiscount = lhng.getString("discount");
                    Log.d("test", String.valueOf(ldiscount));
                    txdiscount.setText(ldiscount);


                } catch (JSONException e)

                {
                    e.printStackTrace();
                }
            } else if (img == 5) {
                txt.setText("Lisa Gowns");
                im.setImageResource(R.drawable.bridalclothes9);
                try {
                    JSONObject root = new JSONObject(dd);
                    JSONObject brdl = root.getJSONObject("Bridal");
                    JSONObject lhng = brdl.getJSONObject("Lehanga");
                    String lcolor = lhng.getString("color");
                    Log.d("test", String.valueOf(lcolor));
                    txname.setText(lcolor);
                    String lsize = lhng.getString("size");
                    Log.d("test", String.valueOf(lsize));
                    txsize.setText(lsize);
                    String lprize = lhng.getString("prize");
                    Log.d("test", String.valueOf(lprize));
                    txprize.setText(lprize);
                    String ldiscount = lhng.getString("discount");
                    Log.d("test", String.valueOf(ldiscount));
                    txdiscount.setText(ldiscount);


                } catch (JSONException e)

                {
                    e.printStackTrace();
                }
            } else if (img == 6) {
                txt.setText("Daisy lehanga");
                im.setImageResource(R.drawable.bridalclothes10);
                try {
                    JSONObject root = new JSONObject(dd);
                    JSONObject brdl = root.getJSONObject("Bridal");
                    JSONObject lhng = brdl.getJSONObject("Lehanga");
                    String lcolor = lhng.getString("color");
                    Log.d("test", String.valueOf(lcolor));
                    txname.setText(lcolor);
                    String lsize = lhng.getString("size");
                    Log.d("test", String.valueOf(lsize));
                    txsize.setText(lsize);
                    String lprize = lhng.getString("prize");
                    Log.d("test", String.valueOf(lprize));
                    txprize.setText(lprize);
                    String ldiscount = lhng.getString("discount");
                    Log.d("test", String.valueOf(ldiscount));
                    txdiscount.setText(ldiscount);


                } catch (JSONException e)

                {
                    e.printStackTrace();
                }
            }
        }

}

