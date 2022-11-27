package com.programming.practice;

public class ValidSubsets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int N=3;
        ValidSubsets v=new ValidSubsets();
        int[] tmp=new int[N];
        int count=0;
        v.getAllSubsets(0,arr,tmp,0,count );
//        System.out.println(count1);
    }

    public void getAllSubsets(int index, int[] array, int[] temp, int size,int count){
        if(index==array.length){
            int sum=0;
            int xor=0;
            if(temp.length==0){
              return;
            }
            else if(temp.length==1){
                count++;
                return;
            }
            else {
                for (int i = 0; i < temp.length; i++) {
                    sum+=temp[i];
                    xor^=temp[i];
                    if (sum==xor)
                        count++;
                }
                return;
            }

        }
        temp[size]=array[index];
        getAllSubsets(index+1,array,temp,size+1,count);
        getAllSubsets(index+1,array,temp,size,count);
        System.out.println(count);
    }
}
