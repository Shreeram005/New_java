class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("from Thread :i="+i);

        }
        System.out.println("Exit From A");

    }

}
class B extends Thread {
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("\t from Thread B : j ="+ j);

        }
        System.out.println("Exit from B");

    }
}
class ThreadTest{
    public static void main(String arg[]){
        new A().start();
        new B().start();

    }
}