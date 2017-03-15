package com.codeclan.listsquids;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 15/03/2017.
 */

public class SquidLister {

    private ArrayList<Squid> list;

    public SquidLister(){
        list = new ArrayList<Squid>();
        list.add(new Squid(750, "Colossal squid", "Mesonychoteuthis hamiltoni"));
        list.add(new Squid(275, "Giant squid", "Architeuthis dux"));
        list.add(new Squid(274, "Humboldt squid", "Dosidicus gigas"));
        list.add(new Squid(3, "Pacific bigfin squid", "Magnapinna pacifica"));
        list.add(new Squid(2, "Strawberry squid", "Histiotheuthis heteropsis"));
        list.add(new Squid(1, "European squid", "Loligo vulgaris"));
    }

    public ArrayList<Squid> getList(){
        return new ArrayList<Squid>(list);
    }
}
