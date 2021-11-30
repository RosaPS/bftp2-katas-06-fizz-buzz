package fizzbuzz;

public class JuegoFizzBuzz {

    public String responder(int numero) {
        String respuesta1 = "Fizz";
        String respuesta2 = "Buzz";
        //String respuesta3 = "FizzBuzz";
        if(numero >=1 && numero <=100){
            if (numero % 3 ==0 && numero % 5 == 0){

                return respuesta1 + respuesta2;
            }else if (numero % 5 == 0){

                return respuesta2;
            }else if (numero % 3 == 0){

                return respuesta1;
            }else {
                return String.valueOf(numero);
            }
        }else{
            return "El número es mayor del permitido";
        }


    }


}
