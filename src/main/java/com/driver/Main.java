package com.driver;

public class Main {

    public static void main(String args[]){
        B obj=new B();
        obj.meth();
    }
    public static class A{
        public String meth(){
            String ans="Invoking method from class A";
          return  ans;
        }
    }
    public static class B extends A{
        @Override
        public String meth(){
            return "class B function";
        }
    }
}