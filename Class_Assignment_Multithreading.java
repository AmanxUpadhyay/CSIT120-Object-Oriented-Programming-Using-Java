package com.semester;

class ABC10 {
    String str;

    ABC10(String s) {
        this.str = s;
    }

    void show(){
        int i;
        for (i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Class_Assignment_Multithreading {
    public static void main(String[] args) {
        ABC10 t1 = new ABC10("Hello");
        ABC10 t2 = new ABC10("World");
        t1.show();
        t2.show();
    }
}
