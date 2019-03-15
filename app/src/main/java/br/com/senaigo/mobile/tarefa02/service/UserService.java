package br.com.senaigo.mobile.tarefa02.service;

import br.com.senaigo.mobile.tarefa02.modelo.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

//@Path("userId")
//@Query("userId")
public interface UserService {

        @GET("users/{id}")
        Call<User> getUser(@Path("id") String id);

}
