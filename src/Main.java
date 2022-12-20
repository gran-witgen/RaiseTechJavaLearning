import java.util.Random;

class Dog{
    private String name;
    public Dog(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(this.name + "はうちの中を走ります");
        System.out.println(this.name + "はまだ遊びたそうです");
    }

    public void run(int i){
        System.out.println(this.name + "は公園を" + i + "回走ります");
    }

    public void sleep(){
        System.out.println(this.name + "は疲れて眠りました");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("しろ");
        System.out.println("この犬の名前は" + dog.getName() + "です");
        dog.setName("くろ");
        System.out.println("飼い主の気分により" + dog.getName() + "に変わりました");
        String [] weatherList = {"晴れ", "雨"};
        int weatherNumber = new Random().nextInt(weatherList.length);
        String weather = weatherList[weatherNumber];
        System.out.println("天気は" + weather + "です");
        if (weather.equals("晴れ")) {
            for(int i=1; i < 4; i++){
                dog.run(i);
            }
            dog.sleep();
        }else{
            dog.run();
        }
    }
}