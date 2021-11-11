package com.senla.brest.task5;

import java.util.ArrayList;
import java.util.List;

public class task5 {
    public static void main(String[] args) {

        List<Obj> objs = new ArrayList<Obj>();

        objs.add(new Obj(1,25, 150));
        objs.add(new Obj(2, 25, 180));
        objs.add(new Obj(3, 22, 500));
        objs.add(new Obj(4, 9, 640));
        objs.add(new Obj(5, 36, 750));
        objs.add(new Obj(6, 24, 260));
        objs.add(new Obj(7, 15, 800));

        Storage storage = new Storage(100);

        storage.doBestSet(objs);

        System.out.println("Набор с максимальной ценностью - " + storage.getBestObjs());
    }
}
