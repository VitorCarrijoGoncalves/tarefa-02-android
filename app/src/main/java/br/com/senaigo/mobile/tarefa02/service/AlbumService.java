package br.com.senaigo.mobile.tarefa02.service;

import java.util.List;

import br.com.senaigo.mobile.tarefa02.modelo.Album;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AlbumService {

    @GET("albums/{id}")
    Call<Album> getAlbum(@Path("id") String id);

    @GET("albums")
    Call<List<Album>> list();

}
