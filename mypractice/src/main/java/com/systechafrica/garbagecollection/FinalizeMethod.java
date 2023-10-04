package com.systechafrica.garbagecollection;

import java.util.ArrayList;
import java.util.List;

public class FinalizeMethod {
    private static List objects = new ArrayList();

    protected void finalize(){
        objects.add(this); // Do not do this
        System.out.println("Calling finalizer");

    }
    public static void main(String[] args) {
        FinalizeMethod fm  = new FinalizeMethod();
        fm.finalize();
        
    }
}
