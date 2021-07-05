package com.demidao.util;


import com.demidao.models.User;

import java.util.ArrayList;
import java.util.List;

public class FishData {

    private static List<User> initUserList = new ArrayList<>();

    static {
        initUserList.add(new User("Charlie", "Croker", 35, "croker@neveremail.it"));
        initUserList.add(new User("Stella", "Bridger", 30, "stella_bri@neveremail.it"));
        initUserList.add(new User("Steve", "Frazelli", 38, "frazza@neveremail.it"));
        initUserList.add(new User("Rob", "Handsome", 34, "handsome.robby@neveremail.it"));
        initUserList.add(new User("John", "Bridger", 65, "jb@neveremail.it"));
        initUserList.add(new User("Mos", "Def", 29, "exploitit@neveremail.it"));
        initUserList.add(new User("Lyle", "Dev", 31, "devly@neveremail.it"));
    }

    public static List<User> getInitUserList() {
        return initUserList;
    }
}
