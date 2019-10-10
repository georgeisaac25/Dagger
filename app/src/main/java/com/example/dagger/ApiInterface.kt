package com.example.dagger
import io.reactivex.Maybe
import retrofit2.Call
import retrofit2.http.GET




interface ApiInterface {
    /*@GET("rest/v2/all/")
    fun getCountries() : Call<List<Country>>

    @GET("rest/v2/all/")
    fun getCountriesUsingRx() : Maybe<List<Country>>*/

    @GET("rest/v2/all/")
    fun getCountries() : Call<List<String>>

}
