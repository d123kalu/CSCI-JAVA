package sorting;
import java.util.Arrays;
 /**
 * MergeSorter sorts an array of doubles by calling on the mergeSort and merge
 * method.
 *
 * @author Ahmed Naeem(100602243) and Onyedikachi Kalu(100557846)
 *
 **/

public class MergeSorter extends Sorter {

  public void sort(double[] list) {
    resetOpCount();
    mergeSort(list);
    countOp();
  }

  public void mergeSort(double[] arr) {
    /**
    *mergeSort recursilvy breaks up the original array arr in halves until
    *array only contains one element. These new arrays are then placed into mergeSort
    *where they are then sorted.
    **/
      int length = arr.length;
      countOp(); //int length
      countOp(); //arr.length
      countOp(); //int length = arr.length;
      if (length < 2) {
        countOp(); //length < 2
        countOp(); //return
        return;
      }

      int mid = length/2;
      countOp();
      countOp();
      double[] first_half = Arrays.copyOfRange(arr, 0, mid);
      countOp(); //double[] first_half
      countOp(); //Arrays.copyOfRange(arr, 0, mid);
      countOp(); //double[] first_half = Arrays.copyOfRange(arr, 0, mid);
      double[] second_half = Arrays.copyOfRange(arr, mid, length);
      countOp(); //double[] second_half
      countOp(); //Arrays.copyOfRange(arr, mid, length);
      countOp(); //double[] second_half = Arrays.copyOfRange(arr, mid, length);

      mergeSort(first_half);
      countOp();
      mergeSort(second_half);
      countOp();

      merge(arr, first_half, second_half);
      countOp();
  }

  public void merge(double[] arr, double[] first, double[] second) {
    /**
    *Arrays which were broken intl halves are now re-arranged from smallest to
    *greatest.
    *
    *param arr      contains original array to be sorted.
    *param first    contains the first half of an unsorted arrays
    *param second   contains the second half of an unsorted array.
    **/
    int i = 0;
    int j = 0;
    countOp();
    countOp();

    while ((i + j) < arr.length) {
      countOp(); //i + j
      countOp(); // i + j < arr.length
        if(j == second.length || (i < first.length && first[i] < second[j])) {
          countOp(); //first[i]
          countOp(); //second[i]
          countOp(); //first[i] < second[j]
          countOp(); //second.length
          countOp(); //j == second.length
          countOp(); //firs.length
          countOp(); //i < first.length
          countOp(); // j == second.length || (i < first.length && first[i] < second[j])
          arr[i+j] = first[i];
          countOp(); //i + j
          countOp(); //arr[i+j]
          countOp(); //first[i]
          countOp(); //arr[i+j] = first[j];
          i++;
          countOp(); //i++
        }
        else {
          arr[i+j] = second[j];
          countOp(); //i+j
          countOp(); //arr[i+j]
          countOp(); //second[j]
          countOp(); //arr[i+j] = second[j];
          j++;
          countOp(); //j++
      }
    }
  }
}
