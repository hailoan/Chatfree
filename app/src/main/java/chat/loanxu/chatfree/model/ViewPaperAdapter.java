package chat.loanxu.chatfree.model;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import chat.loanxu.chatfree.listfragment.ChatFragment;
import chat.loanxu.chatfree.listfragment.FindBBFragment;
import chat.loanxu.chatfree.listfragment.GroupFragment;
import chat.loanxu.chatfree.listfragment.OnlFragment;

/**
 * Created by DaiPhongPC on 2/26/2017.
 */

public class ViewPaperAdapter extends FragmentStatePagerAdapter {
    public ViewPaperAdapter(FragmentManager fm) {
        super(fm);
    }

    public Fragment getItem(int num) {
        switch (num) {
            case 0: {
                return new ChatFragment();
            }
            case 1: {
                return new FindBBFragment();
            }
            case 2: {
                return new GroupFragment();
            }
            case 3: {
                return new OnlFragment();
            }
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "tab 1";
            case 1:
                return "tab 2";
            case 2:
                return "tab 3";
            case 3:
                return "tab 4";
            default:
                return null;
        }
    }
}
