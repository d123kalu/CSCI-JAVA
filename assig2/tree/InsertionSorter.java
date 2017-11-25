package sorting;
import java.util.Arrays;
 /**
 * InsertionSorter class conatians an instertoinSort and swap method. instertoinSort
 * sorts an array consisting of doubles and uses the swap method to switch places
 * of items in the array.
 *
 * @author Ahmed Naeem(100602243) and Onyedikachi Kalu(100557846)
 *
 **/
public class InsertionSorter extends Sorter {

  public void sort(double[] list) {
    resetOpCount();
    insertionSort(list);
    countOp();
  }

  public void insertionSort(double[] list) {
    int i = 1;
    countOp();
    int j;
    countOp();
    while (i < list.length) {
      countOp(); //list.length
      countOp(); // i < list.length
      j = i;
      countOp();
      while (j > 0 && (list[j] < list[j-1])) {
        countOp(); // j > 0
        countOp(); // list[j]
        countOp(); // j - 1
        countOp(); // list[j-1]
        countOp(); // list[j] < list[j-1])
        countOp(); // &&
        swap(list, j, j-1);
        countOp(); //swap
        j--;
        countOp();
      }
      i++;
      countOp();
    }
  }

  public void swap(double[] list, int g, int l) {
    double temp = list[g];
    countOp(); // double temp
    countOp(); // list[g]
    countOp(); // double temp = list[g]
    list[g] = list[l];
    countOp(); // list[g]
    countOp(); // list[l]
    countOp(); // list[g] = list[l]
    list[l] = temp;
    countOp(); //list[l]
    countOp(); //list[l] = temp;
  }
}
