/*
 * hvad printes for flg:
 * x=3, y=20
 * x=4, y=5
 * x=5, y=5
 * x=6, y=10
 *
 */


public static void IfElse(int x, int y){
  int z = 4;
  if (z <= x) {
    z=x+1;
  } else {
    z = z + 9;
  }
  if (z <= y) {
    y++;
  }
  System.out.println(z + " " + y);
}
