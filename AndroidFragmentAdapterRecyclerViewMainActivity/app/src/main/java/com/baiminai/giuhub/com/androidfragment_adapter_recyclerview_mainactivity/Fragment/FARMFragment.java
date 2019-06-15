package com.baiminai.giuhub.com.androidfragment_adapter_recyclerview_mainactivity.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baiminai.giuhub.com.androidfragment_adapter_recyclerview_mainactivity.Adapter.FARMAdapter;
import com.baiminai.giuhub.com.androidfragment_adapter_recyclerview_mainactivity.Data.FARMData;
import com.baiminai.giuhub.com.androidfragment_adapter_recyclerview_mainactivity.R;

import java.util.List;

public class FARMFragment extends Fragment {
    /**
     * 文画baiminai的giuhub欢迎star
     * */

    private RecyclerView recyclerView;
    private List<FARMData> list;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated( savedInstanceState );
        FARMData farmData=new FARMData();
        farmData.setFARM_text( "Fragment+Adapter+MainActivity+RecyclerView之间的联系" );
        list.add( farmData );
        FARMAdapter farmAdapter=new FARMAdapter( list,getContext() );
        recyclerView.setAdapter( farmAdapter );
        recyclerView.setLayoutManager(  new LinearLayoutManager( getContext(),LinearLayoutManager.VERTICAL,false ) );

    }


    /**
     *
     * 初始化farm_fragment.xml布局
     * 初始化布局中的控件
     *
     * */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate( R.layout.farm_fragment,container,false );
        recyclerView=(RecyclerView)view.findViewById( R.id.recyclerview );
        return view;
    }
}
