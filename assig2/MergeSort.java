package assig2;
import java.util.*;

public class MergeSort extends Sorter
{

  public double[] array;
  public double[] tempMergArr;
  public int length;


  public void sort(double[] list){
    this.array=list;
    this.length=list.length;
    this.tempMergArr=new double[length];
    MergeSort(0,length-1);
  }

  public void MergeSort(int lowerIndex,int highgerIndex)
  {

      if(lowerIndex<highgerIndex){
       int middle=lowerIndex+(highgerIndex-lowerIndex)/2;
      //sorts the left side of the array
      MergeSort(lowerIndex,middle);
      //right side
      MergeSort(middle+1,highgerIndex);
      //merge both sides
      mergeParts(lowerIndex,middle,highgerIndex);
      }
    }

    public void mergeParts(int lowerIndex, int highgerIndex, int middle ){
      for(int i=lowerIndex;i<=highgerIndex;i++){
        tempMergArr[i]=array[i];
      }
      int i=lowerIndex;
      int j=middle+1;
      int k=lowerIndex;
      while(i<=middle && j <= highgerIndex){
        if(tempMergArr[i] <= tempMergArr[j]){
          array[k]=tempMergArr[i];
          i++;
          getOpCount();
        }else{
          array[k]=tempMergArr[j];
          j++;
        }
          k++;
      }
      if(i<= middle){
        array[k]=tempMergArr[i];
        k++;
        getOpCount();
      }
    }

  }
