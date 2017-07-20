//quicksort class

public class QS {
 public static < T extends Comparable < T >> void QuickSort(T[] a, int l, int h) {
  if (l < h) {
   int m = (l + h) / 2;
   if (a[m].compareTo(a[l]) < 0) {
    swap(a, m, l);
   }
   if (a[h].compareTo(a[l]) < 0) {
    swap(a, h, l);
   }
   if (a[h].compareTo(a[m]) > 0) {
    swap(a, m, h);
   }
   T pivot = a[h];
   int i = l, j = h - 1;
   while (h > l + 1) {
    while (a[i].compareTo(pivot) < 0)
     i++;
    while (a[j].compareTo(pivot) > 0)
     j--;
    if (i < j) {
     swap(a, i, j);
    } else
     break;
   }
   swap(a, i, h);
   QuickSort(a, l, i - 1);
   QuickSort(a, i + 1, h);
  }
 }
 public static < T extends Comparable < T >> void swap(T[] a, int i, int j) {
  T temp = a[i];
  a[i] = a[j];
  a[j] = temp;
 }
