package com.li.ji.mapdemo1;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ArrayList<LatLng> locations =null;
    private MarkerOptions options = new MarkerOptions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        initData();
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        //init Map
        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLng(locations.get(0)));
        mMap.animateCamera( CameraUpdateFactory.zoomTo( 17.0f ) );

        // set multiple maker on map

        for(int i =0; i< locations.size();i++){
            options.position(locations.get(i));
            options.title(" " + i + " ");
            options.snippet(" " + i + " ");
            mMap.addMarker(new MarkerOptions().position(locations.get(i)).title("test").snippet(" "+ i +" "));
        }

    }


    public void initData(){

        locations = new ArrayList<>();
        locations.add(new LatLng(33.20906261, -87.54453151));
        locations.add(new LatLng(33.20741980, -87.54441510));
        locations.add(new LatLng(33.20704585, -87.54442479));
        locations.add(new LatLng(33.20681519, -87.54443316));
        locations.add(new LatLng(33.20671878, -87.54443666));
        locations.add(new LatLng(33.20670752, -87.54443707));
        locations.add(new LatLng(33.20670546, -87.54443714));
        locations.add(new LatLng(33.20674426, -87.54443574));
        locations.add(new LatLng(33.20670296, -87.54443723));
        locations.add(new LatLng(33.20666029, -87.54443878));
        locations.add(new LatLng(33.20659066, -87.54444131));
        locations.add(new LatLng(33.20644881, -87.54444646));
        locations.add(new LatLng(33.20601537, -87.54388993));
        locations.add(new LatLng(33.20641635, -87.54309042));
        locations.add(new LatLng(33.20787558, -87.54306985));
        locations.add(new LatLng(33.20891317, -87.54311893));
        locations.add(new LatLng(33.20917796, -87.54441991));
        locations.add(new LatLng(33.20939443, -87.54566080));
        locations.add(new LatLng(33.20946533, -87.54605303));
        locations.add(new LatLng(33.20946566, -87.54608076));
        locations.add(new LatLng(33.20951448, -87.54639710));
        locations.add(new LatLng(33.20971781, -87.54750556));
        locations.add(new LatLng(33.20995988, -87.54884357));
        locations.add(new LatLng(33.21009144, -87.54988924));
        locations.add(new LatLng(33.21002573, -87.54994070));
        locations.add(new LatLng(33.21004735, -87.55063372));
        locations.add(new LatLng(33.21013335, -87.55066423));
        locations.add(new LatLng(33.21019106, -87.54977268));
        locations.add(new LatLng(33.20990091, -87.54808980));
        locations.add(new LatLng(33.20959432, -87.54627563));
        locations.add(new LatLng(33.20931010, -87.54469393));
        locations.add(new LatLng(33.20923822, -87.54425361));
        locations.add(new LatLng(33.20916136, -87.54379881));
        locations.add(new LatLng(33.20940031, -87.54313091));
        locations.add(new LatLng(33.21076380, -87.54291523));
        locations.add(new LatLng(33.21231908, -87.54280721));
        locations.add(new LatLng(33.21275237, -87.54252426));
        locations.add(new LatLng(33.21352152, -87.54110771));

    }
}
