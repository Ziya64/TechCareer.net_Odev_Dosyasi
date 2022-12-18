package com.example.odev6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev6.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment implements SearchView.OnQueryTextListener{

   private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);


       binding.toolbarAnasayfa.setTitle("");
        ((AppCompatActivity)getActivity()).setSupportActionBar(binding.toolbarAnasayfa);


        requireActivity().addMenuProvider(new MenuProvider() {
            @Override
            public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
                menuInflater.inflate(R.menu.toolbar_menu,menu);

                MenuItem item = menu.findItem(R.id.action_ara);
                SearchView searchView = (SearchView) item.getActionView();
                searchView.setOnQueryTextListener(AnasayfaFragment.this);

            }

            @Override
            public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
                return false;
            }
        },getViewLifecycleOwner(), Lifecycle.State.RESUMED);

        return binding.getRoot();


    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        ara(query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        ara(newText);
        return false;
    }
    public void ara(String aramaKelimesi){
        Log.e("Kisi ara",aramaKelimesi);

    }
}