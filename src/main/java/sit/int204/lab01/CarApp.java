package sit.int204.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sit.int204.lab01.beans.Car;
import sit.int204.lab01.beans.Counter;
import sit.int204.lab01.beans.GeometricShape;

public class CarApp {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("ApplicationContext.xml");



//        Car car = (Car) context.getBean("car");
//        car.start();
//        System.out.println(car);
//
//        System.out.println("----------------------------------");
//
//        Car carX = (Car) context.getBean("carX");
//        carX.start();
//        System.out.println(carX);


//week4
//        System.out.println("----------------------------------");
//
//        Car carN = (Car) context.getBean("carN");
//        carN.start();
//        System.out.println(carN);
//        System.out.println(System.identityHashCode(carN));
//
//        System.out.println("----------------------------------");
//
//        Car carT = (Car) context.getBean("carT");
//        carT.start();
//        System.out.println(carT);
//        System.out.println(System.identityHashCode(carT));
//
//        System.out.println("----------------------------------");
//
//        Car carZ = (Car) context.getBean("carZ");
//        carZ.start();
//        System.out.println(carZ);
//        System.out.println(System.identityHashCode(carZ));

//counter
        Counter c1 = (Counter) context.getBean("counterA");
        System.out.println(System.identityHashCode(c1));
        System.out.println("-------------------------");
        Counter c2 = (Counter) context.getBean("counterB");
        System.out.println(System.identityHashCode(c2));


//    }
//
//        private static void f1() {
//            ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");  //ลบไปเลยก็ได้

        System.out.println("------------------------------------------");

        //Prototype Scope
        System.out.println("- - - Prototype Scope - - - ");
        Car carT = (Car) context.getBean("carT");
        System.out.println("car T ID : " + System.identityHashCode(carT));

        Car carT2 = (Car) context.getBean("carT");
        System.out.println("car T2 ID : " + System.identityHashCode(carT2));

        System.out.println("-----------------------");
        //Singleton Scope
        System.out.println("- - - Single Scope - - - ");

        Car carC = (Car) context.getBean("carC");
        System.out.println("car C ID : " + System.identityHashCode(carC));

        Car carC2 = (Car) context.getBean("carC");
        System.out.println("car C2 ID : " + System.identityHashCode(carC2));
        System.out.println("---------------------------------------------");





//        Rectangle & Circle
        System.out.println("- - - Rectangle - - -");
        GeometricShape rectangle = (GeometricShape) context.getBean("rectangle");
        System.out.println(rectangle);

        System.out.println("-----------------------");

        System.out.println("- - - Circle - - -");
        GeometricShape circle = (GeometricShape) context.getBean("circle");
        System.out.println(circle);
    }
}

