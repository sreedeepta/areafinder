class area
{ 
  public static void main (int x , int y)
  {
    int area = x * y;
    int radius = y/2;
    int areasemicircle = 1/2*(radius*radius*22/7);
    int totalarea = area + areasemicircle;
    System.out.println("Total Area = " + areasemicircle);
  }
}
