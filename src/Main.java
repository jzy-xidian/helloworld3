import java.awt.*;
import java.util.*;

import com.hello.person.Person;

public class Main {

    //划分数组两边
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }


    public static void main(String[] args){
        int[] arr = {1,0,3};
        quickSort(arr, 0, arr.length-1);

        int i = arr.length-1;
        int max = arr[i];
        //执行次数
        int k=0;


        while(arr[arr.length-1] >= arr.length) {
            int result = arr[i] - arr.length;
            arr[arr.length-1]=result;
            for(int j=0;j<arr.length-1;j++){
                arr[j] += 1;
            }
            quickSort(arr, 0, arr.length-1);
            k++;

            System.out.println();
        }
        System.out.println(k);


    }
}

/*class Person {

    private int id;
    private String name;

    public Person(){
        System.out.println("Firstly");
    }

    public Person(int Id, String Name){
        this.id = Id;
        this.name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}*/