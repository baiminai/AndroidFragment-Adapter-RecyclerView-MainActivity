package com.baiminai.giuhub.com.androidfragment_adapter_recyclerview_mainactivity.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.baiminai.giuhub.com.androidfragment_adapter_recyclerview_mainactivity.Data.FARMData;
import com.baiminai.giuhub.com.androidfragment_adapter_recyclerview_mainactivity.R;

import java.util.List;


public class FARMAdapter extends RecyclerView.Adapter<FARMAdapter.ViewHolder> {

    /**
     * 文画baiminai的giuhub欢迎star
     * */

    private Context mContext;
    private List<FARMData> list;

    /**
     * 具现FARMAdapter时调用的方法
     * */
    public FARMAdapter(List<FARMData> FARMData_list,Context context) {
        list=FARMData_list;
        mContext = context;
    }

    /**
     *
     * 初始化farm_recyclerview.xml布局
     * 控件的点击事件
     *
     * */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.farm_recyclerview,viewGroup,false );

        final ViewHolder viewHolder=new ViewHolder( view );
        viewHolder.text.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( mContext,"文画giuhub欢迎star",Toast.LENGTH_LONG ).show();
            }
        } );
        return viewHolder;
    }

    /**
     *
     * 加入数据的方法
     *
     */

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int  position) {
        FARMData datas=list.get( position );
        viewHolder.text.setText( datas.getFARM_text() );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        /**
         *
         * 初始化布局中的控件
         *
         * */
        public ViewHolder(View itemView){
            super( itemView );
            text=(TextView)itemView.findViewById( R.id.text );
        }
    }

}
