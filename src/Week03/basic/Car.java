package Week03.basic;

//1. 클래스 선언
//2. 객체가 가지고 있어야할 속성(필드)를 정의
//3. 생성자 생성
//4. 객체가 가지고 있어야할 행위(매서드)를 정의

public class Car {
    //<필드영역>

    //고유 데이터 영역
    String company;
    String model = "GV80";
    String color;
    double price;

    //상태 데이터 영역
    double speed;
    char gear;
    boolean lights = true; // 자동차 조명의 상태

    //객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    //<생성자 영역>
    //생성자 생성 : 처음 객체가 생성될 때 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의.
    public Car () {
        //logic
        //기본 생성자 : 생략이 가능
        System.out.println("생성자가 호출되었습니다. 객체가 생성됩니다.");
    }

    //<매서드 영역>

    //gasPedal
    //input : kmh, output: speed
    double gasPedal(double kmh, char type){
        changeGear(type); // 가속도 페달을 밞으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }

    //brakePedal
    //input : x, output: speed
    double brakePedal() {
        speed = 0;
        return speed;
    }


    //changeGear
    //input: gear(char), output: gear
    char changeGear(char type){
        gear = type;
        return gear;
    }

    //onOffLight
    //input: x, output: lights(boolean)
    boolean onOffLight () {
        lights = !lights;
        return lights;
    }

    //horn
    //input: x, output: x
    void horn () {
        System.out.println("빵빵!");
    }

    //자동차의 속도 .. 가변길이 메서드
    void carSpeeds(double ... speeds){
        for(double v : speeds){
            System.out.println("V= "+ v);
        }
    }
}
