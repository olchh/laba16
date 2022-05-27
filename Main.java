package com.company;

public class Main {
    static class Perv{
        int a;
        int b;
        int c;
        public Perv(int a,int b, int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public void verazh(){
            int resault = (int) (Math.pow(b,c) * a);
        }
    }
    @FunctionalInterface
    interface  Converter <T>{
        Vtor convert (T zxc);
    }
    static class Vtor{
        int a;
        int b;
        int c;
        public Vtor(int a,int b, int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public int verazh(){
            int resault = (int) (Math.pow(b,c) * a);
            return resault;
        }
    }
    public static void main(String[] args) {
        Perv wuw = new Perv(1,2,3);
        Converter <Perv> convertertt = x ->  new Vtor(x.a,x.b,x.c);
        Vtor pup = convertertt.convert(wuw);
        System.out.println(pup.verazh());
    }
}