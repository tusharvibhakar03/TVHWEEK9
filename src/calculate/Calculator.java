package calculate;

public class Calculator  {


   public  void addition(int a,int b) {
       int result= a+b;
       System.out.println(result);

   }
    public  void subtraction (int a, int b )
    {  int result= a-b;
        System.out.println(result);

            }

    public  void division(double a, double b)
    { double result= a/b;
        System.out.println(result);

            }

    public  void multiplication(int a, int b)
    {  int result= a/b;
        System.out.println(result);

       }


    public  void calculateResult(int a,int b,char c){
       if(c=='+'){
           addition(a,b);

       } else if (c=='-') {
           subtraction(a,b);

       }else if (c=='*') {
           multiplication(a, b);

       }else if (c=='/') {
           division(a, b);
       }
       else System.out.println("invalid Character" );

        //  System.out.println("Enter first number"+a);
      //  System.out.println("Enter Second  number"+b);
       // System.out.println("Enter symbol");
        //System.out.println("Ans is"+ (a+b));
        //System.out.println("Ans is"+ (a-b));
        //System.out.println("Ans is"+ (a/b));
        //System.out.println("Ans is"+ (a*b));


    }
}
