package com.agiev;

public class Binary {
    StringBuffer s = new StringBuffer();
    int par = 0;
    private int n;
    char[] bin;
    StringBuilder sb = new StringBuilder();
    int up = 0;
    public Binary(char[] n){
        this.bin = n;
        for (int i = 0; i < this.bin.length; i ++){
            this.up += (int) bin[i];
        }
        int x = 1;

        for(int i = 0; i < 32; i ++) {
            sb.append((this.up & x) == 0 ? "0" : "1");
            x <<= 1;
        }
        System.out.println("result = " + sb.reverse());
    }
//    вторая часть, я не успел доделать
//
//    public String negative(){
//        for (int i; sb){
//            System.out.println(i);
//
//        }
//    }
}
