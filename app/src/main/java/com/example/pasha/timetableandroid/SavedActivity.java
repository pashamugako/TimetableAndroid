package com.example.pasha.timetableandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.pasha.timetableandroid.main.Route;
import com.example.pasha.timetableandroid.main.RouteAdapter;
import com.example.pasha.timetableandroid.saved.Saved;
import com.example.pasha.timetableandroid.saved.SavedAdapter;

import java.util.ArrayList;
import java.util.List;

public class SavedActivity extends Activity {

    private ListView savedView;
    private SavedAdapter savedAdapter;
    private ListView mDrawerListView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_layout);

        //initial ListView
        savedView = findViewById(R.id.saved_result);
        ///////////////////////
        //before normal
        List<Saved> list = new ArrayList<>();
        List<Route> listAll = new ArrayList<>();
        listAll.add(new Route("06:14", "asasd", "06:14", "asasd", "asasd"));
        listAll.add(new Route("07:14", "asasd", "07:14", "asasd", "asasd"));
        listAll.add(new Route("08:14", "asasd", "08:14", "asasd", "asasd"));
        listAll.add(new Route("09:14", "asasd", "09:14", "asasd", "asasd"));
        listAll.add(new Route("10:14", "asasd", "10:14", "asasd", "asasd"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        list.add(new Saved(listAll, "Скориничи", "Слуцкий гостинец"));
        ///////////////////////
        savedAdapter = new SavedAdapter(this, list);
        savedView.setAdapter(savedAdapter);

        //menu drawer
        String[] menuTitles = getResources().getStringArray(R.array.heads_menu);
        drawerLayout = findViewById(R.id.drawer_layout_saved);
        mDrawerListView = findViewById(R.id.left_drawer_saved);
        mDrawerListView.setAdapter(new ArrayAdapter<>(this,
                R.layout.drawer_list_item, menuTitles));
        mDrawerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                drawerLayout.closeDrawers();
                switch(i) {
                    case 1:
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        return;
                    case 2:
//                        RouteAdapter routeAdapter = new RouteAdapter()
//                        Toast.makeText(getApplicationContext(),"Обновление данных", Toast.LENGTH_SHORT).show();
                        return;
                }
            }
        });
    }
}