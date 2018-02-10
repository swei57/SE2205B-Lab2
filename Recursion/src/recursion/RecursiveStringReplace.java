package recursion;
public class RecursiveStringReplace
{

    /**
     * replace - Replace all instances of one character by another.
     * 
     * @param  s   The string to do the replacement on.
     * @param  from   The character to be replaced.
     * @param  to   the character to change to.
     * @return     A new string with the appropriate characters replaced.
     */
    public String replace(String s, char from, char to)
    {
        // IMPLEMENT THIS RECURSIVE METHOD
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        
if (s.length() < 1) {  //base case
      return s;
    }
    else {
      char result; //temp char holder
      if(from == s.charAt(0)){ // if the first position of the string's character is the same as from, set change = to.
          result = to;
      }else{
          result = s.charAt(0); //if first position is not the same as from, set change to the index of first position of the string
      }
      return result + replace(s.substring(1), from, to); //decrease the string by 1 from the front, and do recursive call
    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<        
    }
}
