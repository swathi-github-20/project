package com.comp.dep.proj;

public class min {
    public static void main(String args[]) {
        String abc[]={"123","2345"};

        Integer ina[]={4,2,1,3};
        int firstNumber=450;
        float fistFloat=400f;
        System.out.println(firstNumber);
        System.out.println(fistFloat);
//        if(abc[])4>=4
        for(int i=0;i<=ina.length-1;i++){
            int firstLoopNum=ina[i];
           // System.out.println("Number:"  +ina[i]);
            for(int j=0;j<=ina.length-1;j++){
                int secondLoopNum=ina[j];
//                1<2
                if(firstLoopNum < secondLoopNum){
                    //4,3
                    System.out.println("index:"+i+" Value:"+ina[i]);
                }
//                System.out.println("index:"+i+" Value:"+ina[i]);
            }
        }
    }
}
