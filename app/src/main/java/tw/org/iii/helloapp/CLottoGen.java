package tw.org.iii.helloapp;

/**
 * Created by iii on 2017/7/12.
 */

public class CLottoGen {
    public String GetNumbers(){
        int count = 0;
        int[] numbers = new int[6];
        while(count<6){
            double d=100*Math.random();
            int temp=(int)d;
            if(temp>=1 && temp<=49){
                if(!Is重複(temp,numbers)){
                    numbers[count]=temp;
                    count++;
                }
            }
        }

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int l_intMax=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=l_intMax;
                }
            }
        }
        String s = "";

        for(int i=0;i<numbers.length;i++)
            s+=String.valueOf( numbers[i])+" ";
        return s;
    }

    public boolean Is重複(int p_intTarget,int[] p_intNumbers){

        for(int i=0;i<p_intNumbers.length;i++){
            if(p_intTarget==p_intNumbers[i]){
                return true;
            }
        }
        return false;
    }



}
