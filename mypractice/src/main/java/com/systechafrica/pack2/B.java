package com.systechafrica.pack2;

import com.systechafrica.pack1.A;

public class B extends  A{ // protected: accessible with in the packkage and 
//ouside the package through inheritance
   public static void main(String[] args) {
    // A obj = new A();

   B obj = new B ();
    obj.i = 1;
    obj.methodOne();
   } 
}


//? public: direct access, with in the cass, with in the package and ooutside the package without inheritance