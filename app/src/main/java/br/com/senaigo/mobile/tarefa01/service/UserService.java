package br.com.senaigo.mobile.tarefa01.service;

import java.util.List;

import br.com.senaigo.mobile.tarefa01.modelo.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

//@Path("userId")
public interface UserService {

        @GET("/users")
        Call getUser(@Query("userId") String userId);
//        Call<List<User>> get();

}
