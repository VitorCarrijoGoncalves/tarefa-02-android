package br.com.senaigo.mobile.tarefa02.atividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import br.com.senaigo.mobile.tarefa02.R;
import br.com.senaigo.mobile.tarefa02.modelo.Album;
import br.com.senaigo.mobile.tarefa02.retrofit.RetrofitConfig;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlbumActivity extends AppCompatActivity {

    EditText txtIdAlbum;
    TextView respostaIdAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        txtIdAlbum = findViewById(R.id.txt_id_album);
        respostaIdAlbum = findViewById(R.id.resposta_id_album);

    }

    public void funciona(View view) {

        Call<List<Album>> call = new RetrofitConfig().getAlbumService().list();
        call.enqueue(new Callback<List<Album>>() {

            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                List<Album> album = response.body();
                //respostaIdUser.setText(user.getId().toString());
                //Toast.makeText(AlbumActivity.this, "Obj = " + album.getTitle(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable t) {
                Log.e("AlbumService   ", "Erro ao buscar o album:" + t.getMessage());
            }

        });
    }
}
