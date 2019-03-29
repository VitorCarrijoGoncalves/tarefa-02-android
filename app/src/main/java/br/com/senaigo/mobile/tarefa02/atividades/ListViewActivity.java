package br.com.senaigo.mobile.tarefa02.atividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.senaigo.mobile.tarefa02.R;

public class ListViewActivity extends AppCompatActivity {

//    ListView simpleListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
    }

//    public void exibir(View view) {
//
//        // Extrai o conteúdo texto do componente
//        String idAlbum;
//        idAlbum = txtIdAlbum.getText().toString();
//
//        // Formata a saida dos dados
//        String dados = String.format("Os dados informados foram: \n %s %s %s", idAlbum);
//
//        // Exibe os dados para o usuario
//        Toast.makeText( getApplicationContext(), dados, Toast.LENGTH_LONG).show();
//
//    }
//
//    public void add(View view) {
//
//        List<HashMap<String,String>> arrayList = new ArrayList<>();
//
//        String[] from={"id"};
//        int[] to={R.id.txt_id_album};
//        simpleListView=(ListView)findViewById(R.id.simpleListView);
//
//        HashMap m = new HashMap();
//
//        idAlbum = findViewById(R.id.txt_id_album);
//
//        m.put("id", idAlbum.getText().toString());
//        arrayList.add(m);
//        SimpleAdapter simpleAdapter = new SimpleAdapter(this, arrayList, R.layout.activity_item_pedido, from, to);
//        simpleListView.setAdapter(simpleAdapter);
//    }

}
