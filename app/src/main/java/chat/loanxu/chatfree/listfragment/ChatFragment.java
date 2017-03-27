package chat.loanxu.chatfree.listfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import chat.loanxu.chatfree.R;
import chat.loanxu.chatfree.rcview.Itemrc;
import chat.loanxu.chatfree.rcview.ItemrcAdapter;

public class ChatFragment extends Fragment{
    private RecyclerView rcviewchat;
    private ArrayList<Itemrc> lschat;
    private ItemrcAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        rcviewchat = (RecyclerView) view.findViewById(R.id.rcchat);
        lschat = new ArrayList<>();
        lschat.add(new Itemrc(R.drawable.groupsms, "hai loan"));
        lschat.add(new Itemrc(R.drawable.smschat, "xuan mai"));
        lschat.add(new Itemrc(R.drawable.chatonl, "le ha"));
        lschat.add(new Itemrc(R.drawable.findfriend, "phuong thuy"));
        adapter = new ItemrcAdapter(lschat);
        LinearLayoutManager manager = new LinearLayoutManager(view.getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rcviewchat.setLayoutManager(manager);
        rcviewchat.setAdapter(adapter);
        return view;
    }


}
