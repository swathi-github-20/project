package com.comp.dep.proj;

public class min {
    public static void main(String args[]) {
        String abc[]={"123","2345"};

        Integer ina[]={4,2,1,3};
        int firstNumber=450;
        float fistFloat=400f;
        int i;
        int min=ina[0];
        for(i=1;i<ina.length;i++){
            if (ina[i] < min){
                min = ina[i];
            }
        }
        System.out.println("Mini -Value:" +min);


        System.out.println(firstNumber);
        System.out.println(fistFloat);

    }
}
