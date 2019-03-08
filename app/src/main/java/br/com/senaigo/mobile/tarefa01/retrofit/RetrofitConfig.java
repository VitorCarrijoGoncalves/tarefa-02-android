package br.com.senaigo.mobile.tarefa01.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
       this.retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/users")
               .addConverterFactory(JacksonConverterFactory.create())
               .build();
    }

}
