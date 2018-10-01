package l.com.ldk.duykhanh.b5_dialog_alertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnDialog,btnAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDialog = findViewById(R.id.btnDialog);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
        btnAlertDialog = findViewById(R.id.btnAlertDialog);
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog();
            }
        });


    }

    private void showDialog(){
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setTitle("Show Dialog");
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_layout);



        Button btnDongy = dialog.findViewById(R.id.btnDy);
        Button btnNever = dialog.findViewById(R.id.btnNv);

        btnDongy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This", Toast.LENGTH_SHORT).show();
            }
        });
        btnNever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void showAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("AlertDialog");
        builder.setMessage("Ban co muon dang xuat khong");

        builder.setPositiveButton("Dong y", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(MainActivity.this, "Dang xuat thanh cong", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            }
        });
        builder.setNegativeButton("Khong dong y", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Dang xuat khong thanh cong", Toast.LENGTH_SHORT).show();
            dialogInterface.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
