package com.senla.brest.task5;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Obj> bestObjs = null;

    private int maxVolume;
    private int bestPrice;

    public Storage(int maxVol) {
        this.maxVolume = maxVol;
    }
    //вычисляет общий объем набора предметов
    private int sumVolume(List<Obj> objs) {
        int res = 0;
        for (Obj obj : objs) {
            res += obj.getVolume();
        }
        return res;
    }

    // вычисляет общую ценность набора предметов
    private int sumPrice(List<Obj> objs) {
        int res = 0;
        for (Obj obj : objs) {
            res += obj.getPrice();
        }
        return res;
    }

    //является ли данный набор лучшим
    private void bestOrNo(List<Obj> objs) {
        if (this.bestObjs == null) {
            if (this.sumVolume(objs) <= this.maxVolume) {
                this.bestObjs = objs;
                this.bestPrice = this.sumPrice(objs);
            }
        } else {
            if (this.sumVolume(objs) <= this.maxVolume && this.sumPrice(objs) > this.bestPrice) {
                this.bestObjs = objs;
                this.bestPrice = this.sumPrice(objs);
            }
        }
    }

    //перебор всех наборов
    public void doBestSet(List<Obj> objs) {
        if (objs.size() > 0) {
            this.bestOrNo(objs);
        }
        for (int i = 0; i < objs.size(); i++) {
            List<Obj> newSet = new ArrayList<Obj>(objs);
            newSet.remove(i);
            doBestSet(newSet);
        }
    }

    public List<Obj> getBestObjs() {
        return this.bestObjs;
    }
}
