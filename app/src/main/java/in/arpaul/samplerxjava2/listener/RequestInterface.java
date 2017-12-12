package in.arpaul.samplerxjava2.listener;

import java.util.List;

import in.arpaul.samplerxjava2.model.Android;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by aritrapal on 11/12/17.
 */

public interface RequestInterface {
    @GET("android/jsonarray/")
    Observable<List<Android>> register();
}
