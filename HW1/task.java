/**
 * Сортировка кучей, пирамидальная сортировка
 */

 public class HeapSort {

    /**
     * Метод запуска сортировки массива
     * @param args
     */
    public static void main(String[] args) {
      int[] arr = {1234, 4, 7, 2, 1, -3, 0, 567, 45, 90, 34,2, 234};
  
      heapSort(arr);
  
      for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
  
    /**
     * Метод создания дерева массива
     * @param arr
     */
    public static void heapSort(int[] arr) {
      //длина массива
      int n = arr.length;
  
      //создаём дерево, построение кучи (перегруппируем массив)
      for(int i  = n / 2 - 1; i >= 0; i--)
        heapify(arr, i , n);
  
      //Делаем сортировку массива, уже отсортированного дерева,
      //Один за другим извлекаем элементы из кучи
      for (int i = n - 1; i >= 0; i--){
  
        // Перемещаем текущий корень в конец
        int temp = arr[i];
        arr[i] = arr[0];
        arr[0] = temp;
  
        // Вызываем процедуру heapify на уменьшенной куче
        heapify(arr, 0, i);
      }
  
    }
}

