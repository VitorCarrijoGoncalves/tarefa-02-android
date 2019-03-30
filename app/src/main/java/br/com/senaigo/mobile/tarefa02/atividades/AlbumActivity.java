package br.com.senaigo.mobile.tarefa02.atividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.senaigo.mobile.tarefa02.R;
import br.com.senaigo.mobile.tarefa02.modelo.Album;
import br.com.senaigo.mobile.tarefa02.retrofit.RetrofitConfig;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlbumActivity extends DebugActivity {

    EditText txtIdAlbum;
    ListView simpleListView;
    List<HashMap<String,String>> listAlbums = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

    }

    public void exibir(Album album) {

        simpleListView=(ListView)findViewById(R.id.simpleListView);

        HashMap<String, String> m = new HashMap();

        m.put("id", String.valueOf(album.getId()));
        m.put("userID", String.valueOf(album.getUserIdId()));
        m.put("title", album.getTitle());
        listAlbums.add(m);

        String[] from={"id", "userID", "title"};
        int[] to={R.id.list_view_id_album, R.id.list_view_user_id_album, R.id.list_view_title_album};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listAlbums, R.layout.activity_list_view, from, to);
        simpleListView.setAdapter(simpleAdapter);
    }

    public void funciona(final View view) {

        Call<List<Album>> call = new RetrofitConfig().getAlbumService().list();
        call.enqueue(new Callback<List<Album>>() {

            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                List<Album> albums = response.body();
                //respostaIdUser.setText(user.getId().toString());
                for (Album album : albums) {
                    exibir(album);
                    //Toast.makeText(AlbumActivity.this, "Obj = " + album.getTitle(), Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable t) {
                Log.e("AlbumService   ", "Erro ao buscar o album:" + t.getMessage());
            }

        });
    }
}
