package B4_Metanit.P4_Exceptions;

class Program{






    class getFactorial {
        public static int getFactorial(int num) throws FactorialException{

            int result = 1;


            return result;
        }
    }

    class FactorialException extends Exception{
        private int number;
        public int getNumber(){return number;}
        public FactorialException(String message, int num){
            super(message);
            number = num;

        }

    }
}
