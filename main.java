class area
{ 
  public static void main (string a , string b)
  { 
   string area = a*b;
   string radius = b/2;
   string areaofsemicircle = 1/2(radius * radius * 22/7);
   string areatotal = area + areaofsemicircle;
   System.out.println("Total Area : " + areatotal);
   }
}
