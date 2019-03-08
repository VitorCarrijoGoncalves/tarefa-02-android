package br.com.senaigo.mobile.tarefa01.resource;

import java.util.List;

import br.com.senaigo.mobile.tarefa01.modelo.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface UserResource {

    @GET("user")
    Call<List<User>> get();

    @POST("user")
    Call<User> post(@Body User user);

    @PUT("user")
    Call<User> put(@Body User user);

    @DELETE("user")
    Call<Void> delete(@Body User user);

}
