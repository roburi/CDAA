package burgos.com.rodrigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import burgos.com.rodrigram.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment
{


    public SearchFragment()
    {

    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        return inflater.inflate(R.layout.fragment_search, container, false);
    }

}
