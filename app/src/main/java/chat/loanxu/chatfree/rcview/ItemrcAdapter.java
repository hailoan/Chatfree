package chat.loanxu.chatfree.rcview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import chat.loanxu.chatfree.R;
import chat.loanxu.chatfree.view.ChatO;

/**
 * Created by DaiPhongPC on 2/27/2017.
 */

public class ItemrcAdapter extends RecyclerView.Adapter<ItemrcAdapter.ItemViewHoler> {
    private ArrayList<Itemrc> lsitem;

    public ItemrcAdapter(ArrayList<Itemrc> lsitem) {
        this.lsitem = lsitem;
    }

    @Override
    public ItemViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.itemrcview, null);

        return new ItemViewHoler(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHoler holder, int position) {
        holder.img.setImageResource(lsitem.get(position).getImg());
        holder.nd.setText(lsitem.get(position).getNoidung());
        holder.img.setOnClickListener(on_click);
        holder.nd.setOnClickListener(on_click);

    }

    private View.OnClickListener on_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//        Toast.makeText(v.getContext(), "check", Toast.LENGTH_SHORT).show();
            Intent it = new Intent(v.getContext(), ChatO.class);
            v.getContext().startActivity(it);

        }
    };

    @Override
    public int getItemCount() {
        return lsitem.size();
    }

    class ItemViewHoler extends RecyclerView.ViewHolder {
        ImageView img;
        TextView nd;

        public ItemViewHoler(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img_);
            nd = (TextView) itemView.findViewById(R.id.nd_);

        }
    }
}
