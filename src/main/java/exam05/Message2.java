package exam05;

public class Message2 {

    public void send(String message) {
        System.out.printf("전송메서지 : %s%n", message);

    }


    public void init(){  //초기화전에 호출
        System.out.println("init!!");
    }
    public void close() { //소멸시전에 호출
        System.out.println("close!!");

    }

}