package br.com.philippesis.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnNovaFrase;
    private TextView txtFraseDia;

    private Integer numeroAnterior, numeroSorteado;

    private Random random;

    private String[] frases = {
            "Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todos",
            "O sucesso normalmente vem para quem está ocupado demais para procurar por ele",
            "Se você não está disposto a arriscar, esteja disposto a uma vida comum"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNovaFrase = (Button) findViewById(R.id.idBtnNovaFrase);
        txtFraseDia = (TextView) findViewById(R.id.idTXTFraseDia);

        numeroAnterior = -1;
        numeroSorteado = -1;

        random = new Random();

        btnNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // IF para verificar se número sorteado é igual ao número sorteado anterior.

                do {
                    numeroSorteado = random.nextInt( frases.length );
                } while (numeroAnterior == numeroSorteado);

                    // Exibe frase na tela
                    txtFraseDia.setText(frases[numeroSorteado]);
                    numeroAnterior = numeroSorteado;

            }
        });

    }
}
