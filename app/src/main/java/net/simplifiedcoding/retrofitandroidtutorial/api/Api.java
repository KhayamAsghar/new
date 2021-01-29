package net.simplifiedcoding.retrofitandroidtutorial.api;

import net.simplifiedcoding.retrofitandroidtutorial.models.DefaultResponse;
import net.simplifiedcoding.retrofitandroidtutorial.models.LoginResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Api {


    @FormUrlEncoded
    @POST("signup")
    Call<ResponseBody> signup(
            @Field("email") String email,
            @Field("password") String password,
            @Field("name") String name
    );

    @FormUrlEncoded
    @POST("login")
    Call<LoginResponse> login(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password
    );


}
