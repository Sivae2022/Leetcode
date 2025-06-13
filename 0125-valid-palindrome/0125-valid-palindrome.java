class Solution {
  public boolean isPalindrome(String s) {
    String S=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
    int l = 0;
    int r = S.length() - 1;

    while(l<=r)
    {
        if(S.charAt(l)!=S.charAt(r))
        {
            return false;
        }
        l++;
        r--;
    }
    return true;
  }
}


