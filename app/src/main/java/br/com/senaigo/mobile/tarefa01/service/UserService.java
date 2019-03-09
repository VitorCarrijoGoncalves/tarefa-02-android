package br.com.senaigo.mobile.tarefa01.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {

        @GET("/users")
        Call getUser(@Path("userId") String userId);

}
