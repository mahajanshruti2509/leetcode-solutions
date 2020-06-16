/*
Input : "xyz";
Output : ["", z, y, yz, x, xz, xy, xyz]
*/
public class Subsequences {
  public static String[] findSubsequences(String str) {
    if(str.length() == 0) {
      String[] ans = {""};
      return ans;
    }

    String[] smallAns = findSubsequences(str.substring(1));

    String[] ans = new String[2 * smallAns.length];

    int index = 0;
    for(int i = 0; i < smallAns.length; i++) {
      ans[index] = smallAns[i];
      index++;
    }
    for(int i = 0; i < smallAns.length; i++) {
      ans[index] = str.charAt(0) +  smallAns[i];
      index++;
    }
    return ans;
  }

  public static void main(String[] args){
    String str = "xyz";
    String[] output = findSubsequences(str);
    for(int i = 0; i < output.length; i++) {
      System.out.println(output[i]);
    }
  }
}
