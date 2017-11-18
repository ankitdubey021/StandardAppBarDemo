package adaptors;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ankit.standardappbar.R;

/**
 * Created by Administrator on 11/18/2017.
 */

public class ArrayAdapter extends RecyclerView.Adapter<ArrayAdapter.ViewHolder>{

    private String[] data;
    public ArrayAdapter(String[] data){
        this.data=data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv;
        public ViewHolder(View v){
            super(v);
            tv=(TextView)v.findViewById(R.id.title);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

}
