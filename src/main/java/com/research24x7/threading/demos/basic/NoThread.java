
package com.research24x7.threading.demos.basic;


public class NoThread {


    public NoThread () {

        super();
    }


    public static void main (String [] args) {

        for (int i=0; i<3; i++) {

            MyThread mt = new MyThread ();
            mt.run ();
        }
    }
}