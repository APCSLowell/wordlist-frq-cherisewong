import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int sum = 0;
    for (int i = 0; i < myList.size(); i++){
      if (myList.get(i).length() == len){
        sum += 1;
      }
    }
    return sum;
  }

  public void removeWordsOfLength(int len)
  {
    ArrayList<String> newArr = new ArrayList<String>();
    for (int i = 0; i < myList.size(); i++){
      if(newArr.get(i).length() == len){
        newArr.remove(i);
      }
    }
  }
}
