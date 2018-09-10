package sv.dk.com.dimeunahistoria;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import sv.dk.com.dimeunahistoria.Modelos.Historia;

/**
 * Created by DK-Ragnar on 8/9/2018.
 */

public interface ServicioHistorias {

    String base_url = "http://10.0.2.175/CuentameUnaHistoria/";

    @GET("ServicioHistorias.php/")
    Call<List<Historia>> getHistorias();

    @GET("autores/{id}")
    Call<Historia> getAutor(@Path("id") String id);

}
