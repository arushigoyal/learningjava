package com.learning.exceptionhandling;

// Runtime exception
public class MainRuntimeException {


    public static void main(String[] args) {

        int a=-1;
        int b =30;

        try {

            if(a == 0){
              throw new ArithmeticException("infinite arithamtic");
            }else if(a == -1){
                throw new newException("No negative value allowed");
            }else if(a < 1){
                throw new MyException("cannot divide by negative integrer");
            } else
              execute(a,b);
            if(a==b){
                throw new IllegalArgumentException("both numbers cannot be the same");
            }


        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }catch (IllegalArgumentException iae){
            iae.printStackTrace();
        }catch (MyException my){
            my.printStackTrace();
        }catch (newException ne){
            ne.printStackTrace();
        }



    }


    public static void execute(int a , int b){

        int result = b/a;

        System.out.println(result);

    }

}
