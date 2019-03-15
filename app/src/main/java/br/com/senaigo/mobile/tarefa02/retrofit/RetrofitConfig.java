package br.com.senaigo.mobile.tarefa02.retrofit;

import br.com.senaigo.mobile.tarefa02.service.UserService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
       this.retrofit = new Retrofit.Builder()
               .baseUrl("https://jsonplaceholder.typicode.com/")
               .addConverterFactory(JacksonConverterFactory.create())
               .build();
    }

    public UserService getUserService() {
        return this.retrofit.create(UserService.class);
    }

}
