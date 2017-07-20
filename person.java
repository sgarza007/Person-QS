//author:Saul Garza
//Person Class

public class person implements Comparable < person > {
 private String last;
 private int age;
 public person() {
  last = "";
  age = 0;
 }
 public person(String newlast, int newage) {
  last = newlast;
  age = newage;
 }
 public String getName() {
  return last;
 }
 public int getAge() {
  return age;
 }
 public void setName(String newlast) {
  last = newlast;
 }
 public void setAge(int newage) {
  age = newage;
 }
 @Override
 public int compareTo(person another) {
  if (last.compareTo(another.last) == 0) {
   if (Math.abs(age - (another).age) < .01) {
    return 0;
   } else if (age < (another).age) {
    return -1;
   } else
    return 1;
  } else
   return last.compareTo(another.last);
 }
}
