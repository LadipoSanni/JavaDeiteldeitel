public class SemicolonTest {
   public static void returnReverse(char[] arr){
      int k = 0;
      int j = arr.length-1;
      char temp;

      while(k < j){
         temp = arr[k];
         arr[k]=arr[j];
         arr[j]=temp;
         k++;
         j--;
      }
      System.out.println(arr);


   }
   public static void main(String[] args) {
      char[] reversArr = {'e','l','u','b','a',};
      returnReverse(reversArr);
//      displayReversedArray(arr);
    }
}
