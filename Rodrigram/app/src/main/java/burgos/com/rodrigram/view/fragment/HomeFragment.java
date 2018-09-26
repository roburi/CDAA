package burgos.com.rodrigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Objects;

import burgos.com.rodrigram.R;
import burgos.com.rodrigram.adapter.PictureAdapterRecyclerView;
import burgos.com.rodrigram.model.Picture;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment
{
    public HomeFragment()
    {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar(getResources().getString(R.string.tab_home),false, view);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPictures(),R.layout.cardview_picture, getActivity());

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }
    public ArrayList<Picture> buildPictures()
    {
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://www.dzoom.org.es/wp-content/uploads/2017/07/seebensee-2384369-810x540.jpg","Rodrigo Burgos","3 dias","120 Me gusta"));
        pictures.add(new Picture("https://previews.123rf.com/images/ralfmu/ralfmu1702/ralfmu170200002/73673994-seebensee-%E3%83%84%E3%83%BC%E3%82%AF%E3%82%B7%E3%83%A5%E3%83%94%E3%83%83%E3%83%84%E3%82%A7.jpg","Alejandro Urias","5 dias","100 Me gusta"));
        pictures.add(new Picture("http://www.freejpg.com.ar/asset/400/8c/8cda/F100011205.jpg","Juan Perez","3 dias","50 Me gusta"));
        pictures.add(new Picture("https://media-cdn.tripadvisor.com/media/photo-s/0e/9a/18/b7/plitvice-lakes-and-rastoke.jpg","Miguel Diaz","7 dias","80 Me gusta"));

        return pictures;
    }

    public void showToolbar(String tittle, boolean upButton, View view)
    {
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) view.findViewById(R.id.toolbar);

        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }

}
