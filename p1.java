class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        System.out.println(msg);

    }
    class P1{
        public static void main(String arg[]){
            try{
                vote(12);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
        public static void vote(int age) throws InvalidAgeException{
            if(age<18){
                throw new InvalidAgeException("Not eligible for voting ");

            }
            else{
                System.out.println("Eligible for voting ");

            }

        }   
        
         }
}