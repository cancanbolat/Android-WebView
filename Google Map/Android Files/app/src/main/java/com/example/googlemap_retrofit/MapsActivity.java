package com.example.googlemap_retrofit;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.googlemap_retrofit.RestApi.ManagerAll;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    SupportMapFragment mapFragment;

    // default lat, lot and title
    private Float lat = 10.0f, lot = 10.5f;
    private String title = "Default Title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        getMapInfo();
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(lat, lot);
        mMap.addMarker(new MarkerOptions().position(sydney).title(title));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    public void getMapInfo() {
        Call<MapJson> request = ManagerAll.getOurInstance().getMapInfo();
        request.enqueue(new Callback<MapJson>() {
            @Override
            public void onResponse(Call<MapJson> call, Response<MapJson> response) {
                if (response.isSuccessful()) {
                    title = response.body().getTitle();
                    lat = response.body().getLat();
                    lot = response.body().getLot();
                    mapFragment.getMapAsync(MapsActivity.this);
                }
            }

            @Override
            public void onFailure(Call<MapJson> call, Throwable t) {

            }
        });
    }

}