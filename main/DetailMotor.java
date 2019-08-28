package com.example.mysubmission;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailMotor extends AppCompatActivity
{   public static final String Extra_Name = "extra_name";
    TextView tvName, tvSpek, tvHarga;
    ImageView imgMotor;

    @Override
    protected void  onCreate(Bundle saveInstanceState)
    {   super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_detail);
        tvName = findViewById(R.id.tv_name);
        tvHarga = findViewById(R.id.tv_harga);
        tvSpek = findViewById(R.id.tv_spek);
        imgMotor = findViewById(R.id.img_motor);

        String name = getIntent().getStringExtra(Extra_Name);
        tvName.setText(name);

        if(name.equals("Yamaha Xride 125"))
        {   imgMotor.setImageResource(R.drawable.xride);
            tvSpek.setText("SUB-TANK SUSPENSION,TEKNOLOGI DIASIL CYLINDER,LAMPU LED DRL dan Hazard, ANSWER BACK SYSTEM, MESIN BLUECORE 125 CC");
            tvHarga.setText("Rp.18.035.000");
        }
        else if(name.equals("Yamaha N-Max"))
        {   imgMotor.setImageResource(R.drawable.nmax);
            tvSpek.setText("LAMPU LED, REAR SUB TANK SUSPENSION, VARIABLE VALVE ACTUATION (VVA), MESIN BLUECORE 155 CC, DOUBLE DISC BRAKE");
            tvHarga.setText("Rp.27.540.000");
        }
        else if(name.equals("Yamaha Fino Grande"))
        {   imgMotor.setImageResource(R.drawable.fino);
            tvSpek.setText("LAMPU LED dan Hazard, MEGABOX 8,7 L, MESIN BLUECORE 125 CC, SMART STAND SIDE SWITCH, ADVANCE KEY SYSTEM");
            tvHarga.setText("Rp.19.220.000");
        }
        else if(name.equals("Yamaha Soul GT AKS"))
        {   imgMotor.setImageResource(R.drawable.soul);
            tvSpek.setText("LAMPU LED, BAN LEBAR, MESIN BLUECORE 125 CC, SMART LOCK SYSTEM, ADVANCE KEY SYSTEM, BAGASI LUAS & LEGA");
            tvHarga.setText("Rp.17.300.000");
        }
        else if(name.equals("Yamaha Jupiter MX"))
        {   imgMotor.setImageResource(R.drawable.mx);
            tvSpek.setText("DIGITAL HUMANIC SPEEDOMETER, BAN TUBELESS, 150CC FI, LIQUID COOLED SYSTEM, LIGHT FRAME DESIGN");
            tvHarga.setText("Rp.18.900.000");
        }
        else if(name.equals("Yamaha MT 15"))
        {   imgMotor.setImageResource(R.drawable.mt15);
            tvSpek.setText("LAMPU LED, ASSIST & SLIPPER CLUTCH, BAN TUBELESS, ENGINE 155CC LC4V WITH VVA, UPSIDE DOWN SUSPENSION");
            tvHarga.setText("Rp.35.335.000");
        }
        else if(name.equals("Yamaha Mio M3"))
        {   imgMotor.setImageResource(R.drawable.miom3);
            tvSpek.setText("STOP & START SYSTEM, ADVANCE KEY SYSTEM (AKS), QUICK START, BLUECORE 125 CC, TANKI BENSIN 4.2L, SMART LOCK SYSTEM");
            tvHarga.setText("Rp.16.715.000");
        }
        else if(name.equals("Yamaha Freego S ABS"))
        {   imgMotor.setImageResource(R.drawable.freego);
            tvSpek.setText("LAMPU LED dan Hazard, ELECTRIC POWER SOCKET, BAN TUBELESS, MESIN BLUECORE 125 CC, SMART FRONT REFUEL, SMART KEY SYSTEM");
            tvHarga.setText("Rp.22.840.000");
        }
        else if(name.equals("Yamaha R15"))
        {   imgMotor.setImageResource(R.drawable.r15);
            tvSpek.setText("LAMPU LED dan Hazard, BAN TUBELESS, ENGINE 155CC LC4V WITH VVA, ASSIST & SLIPPER CLUTCH, DELTABOX FRAME");
            tvHarga.setText("Rp.35.760.000");
        }
        else if(name.equals("Yamaha Mio S"))
        {   imgMotor.setImageResource(R.drawable.mios);
            tvSpek.setText("LAMPU LED dan Hazard, ANSWER BACK SYSTEM, BAN TUBELESS, MESIN BLUECORE 125 CC, TANKI BENSIN 4.2L, SMART LOCK SYSTEM");
            tvHarga.setText("Rp.16.360.000");
        }
    }
}