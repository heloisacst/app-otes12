package appmedico.com.appotes06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Configura os botões para navegar pelas activity
        findViewById(R.id.button_medico).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MedicosActivity.class)));
        findViewById(R.id.button_paciente).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, PacientesActivity.class)));
        findViewById(R.id.button_consultas).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ConsultasActivity.class)));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}