package br.com.senaigo.mobile.tarefa01.atividades;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.senaigo.mobile.tarefa01.R;

//import static br.com.senaigo.mobile.tarefa01.R.*;

public class TelaActivity extends DebugActivity {

    ListView simpleListView;

    protected EditText txtId;
    protected EditText txtCliente;
    protected EditText txtData;
    protected EditText txtProdutos;
    protected EditText txtValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_pedido);
    }

    public void exibir(View view) {

        // Procura o componente da view pelo ID
        txtCliente = findViewById(R.id.txt_cliente);
        txtData = findViewById(R.id.txt_data);
        txtProdutos = findViewById(R.id.txt_produtos);
        txtValor = findViewById(R.id.txt_valor);

        // Extrai o conteúdo texto do componente
        String cliente, data, produtos, valor;
        cliente = txtCliente.getText().toString();
        data = txtData.getText().toString();
        produtos = txtProdutos.getText().toString();
        valor = txtValor.getText().toString();

        // Formata a saida dos dados
        String dados = String.format("Os dados informados foram: \n %s %s %s", cliente, data, produtos, valor);

        // Exibe os dados para o usuario
        Toast.makeText( getApplicationContext(), dados, Toast.LENGTH_LONG).show();

    }
        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();

    public void add(View view) {
        String[] from={"id", "cliente", "produtos", "data", "valor"};
        int[] to={R.id.txt_id, R.id.txt_cliente, R.id.txt_produtos, R.id.txt_data, R.id.txt_valor};
        simpleListView=(ListView)findViewById(R.id.simpleListView);

        HashMap m = new HashMap();

        txtId = findViewById(R.id.txt_id);
        txtCliente = findViewById(R.id.txt_cliente);
        txtData = findViewById(R.id.txt_data);
        txtProdutos = findViewById(R.id.txt_produtos);
        txtValor = findViewById(R.id.txt_valor);

        m.put("id", txtId.getText().toString());
        m.put("cliente", txtCliente.getText().toString());
        m.put("produtos", txtProdutos.getText().toString());
        m.put("data", txtData.getText().toString());
        m.put("valor", txtValor.getText().toString());
        arrayList.add(m);
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, arrayList, R.layout.activity_item_pedido, from, to);
        simpleListView.setAdapter(simpleAdapter);
    }

}
