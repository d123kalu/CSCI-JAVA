
package assig2;
//import java.util.*;

public class QuickSort extends Sorter{

  public double[] list;
  public double length;
    //lowerIndex=left  highgerIndex=right
    public int QuickSort(double list[],int lowerIndex, int highgerIndex){
      int i=lowerIndex;
      int j=highgerIndex;
      double temp;
      double k= list[(highgerIndex+lowerIndex)/2];
      while(i <= j){
        while (list[i]<k)
          i++;
        while(list[j]>k)
          j--;
        if(i<=j){
          temp=list[i];
          list[i]=list[j];
          list[j]=temp;
          i++;
          j--;
          }
          getOpCount();
        }
        return i;
  }
    public void sort(double list[]){
      int lowerIndex=0;
      int highgerIndex=0;
      int index= QuickSort(list,lowerIndex,highgerIndex);
      if(lowerIndex<index-1)
        QuickSort(list,lowerIndex,index-1);
      if(index<highgerIndex)
        QuickSort(list,index,highgerIndex);

    }

  }
