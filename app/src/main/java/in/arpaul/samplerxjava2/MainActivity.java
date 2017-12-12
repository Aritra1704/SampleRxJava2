package in.arpaul.samplerxjava2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
//            @Override
//            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
//                //Use onNext to emit each item in the stream//
//                e.onNext(1);
//                e.onNext(2);
//                e.onNext(3);
//                e.onNext(4);
//
//                //Once the Observable has emitted all items in the sequence, call onComplete//
//                e.onComplete();
//            }
//        });

//        Observer<Integer> observer = new Observer<Integer>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//                Log.e(TAG, "onSubscribe: ");
//            }
//
//            @Override
//            public void onNext(Integer integer) {
//                Log.e(TAG, "onNext: " + integer);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                Log.e(TAG, "onError: ");
//            }
//
//            @Override
//            public void onComplete() {
//                Log.e(TAG, "onComplete: All Done!");
//            }
//        };
//
//        observable.subscribe(observer);


        //2nd Type
        Observable<String> observable = Observable.just("Hello World!");
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.e(TAG, "onSubscribe: ");
            }

            @Override
            public void onNext(String value) {
                Log.e(TAG, "onNext: " + value);
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                Log.e(TAG, "onComplete: All Done!");
            }
        };

        observable.subscribe(observer);
    }
}
