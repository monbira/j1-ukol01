package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        /*
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();

        zofka.setPenColor(Color.black);
        zofka.setPenWidth(5);

        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(71);
        zofka.turnRight(90);
        zofka.move(71);
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(4);
        zofka.penDown();
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(90);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(135);
        zofka.move(150);
        zofka.turnLeft(45);
        zofka.move(25);
        zofka.turnRight(180);
        zofka.move(25);
        zofka.turnRight(90);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);

        zofka.penUp();
        zofka.turnLeft(135);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.penDown();
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.move(30);

        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(200);
        zofka.penDown();


        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.penUp();
        zofka.move(200);
        zofka.penDown();


        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        */

        //celý obrázek

        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnRight(180);
        zofka.penDown();

        zofka.setPenColor(Color.black);
        zofka.setPenWidth(5);

        //slunicko

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(80);

        zofka.turnLeft(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(10);
        zofka.move(5);

        //konec slunicko


        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.penDown();

        //domecek

        zofka.turnLeft(45);
        zofka.move(56);
        zofka.turnLeft(135);
        zofka.move(80);
        zofka.turnLeft(135);
        zofka.move(56);

        zofka.turnRight(180);
        zofka.move(56);

        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(100);

        //konec domecek

        //4x

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(56);
        zofka.turnRight(45);
        zofka.move(150);

        zofka.turnRight(135);
        zofka.penDown();

        zofka.move(56);
        zofka.turnLeft(135);
        zofka.move(80);
        zofka.turnLeft(135);
        zofka.move(56);

        zofka.turnRight(180);
        zofka.move(56);

        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(100);



        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(56);
        zofka.turnRight(45);
        zofka.move(150);

        zofka.turnRight(135);
        zofka.penDown();

        zofka.move(56);
        zofka.turnLeft(135);
        zofka.move(80);
        zofka.turnLeft(135);
        zofka.move(56);

        zofka.turnRight(180);
        zofka.move(56);

        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(100);



        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(56);
        zofka.turnRight(45);
        zofka.move(150);

        zofka.turnRight(135);
        zofka.penDown();

        zofka.move(56);
        zofka.turnLeft(135);
        zofka.move(80);
        zofka.turnLeft(135);
        zofka.move(56);

        zofka.turnRight(180);
        zofka.move(56);

        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(100);


        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(56);
        zofka.turnRight(45);
        zofka.move(150);

        zofka.turnRight(135);
        zofka.penDown();

        zofka.move(56);
        zofka.turnLeft(135);
        zofka.move(80);
        zofka.turnLeft(135);
        zofka.move(56);

        zofka.turnRight(180);
        zofka.move(56);

        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(100);

        //domecek dole

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(56);
        zofka.turnRight(135);
        zofka.move(200);

        zofka.turnRight(45);
        zofka.penDown();

        zofka.move(56);
        zofka.turnLeft(135);
        zofka.move(80);
        zofka.turnLeft(135);
        zofka.move(56);

        zofka.turnRight(180);
        zofka.move(56);

        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(100);

        zofka.turnRight(45);
        zofka.move(56);
        zofka.penUp();
        zofka.turnLeft(135);
        zofka.move(600);
        zofka.turnLeft(45);
        zofka.penDown();

        zofka.move(56);
        zofka.turnLeft(135);
        zofka.move(80);
        zofka.turnLeft(135);
        zofka.move(56);

        zofka.turnRight(180);
        zofka.move(56);

        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(100);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(400);
        zofka.penDown();

        //prasatko

        zofka.turnLeft(180);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(71);
        zofka.turnRight(90);
        zofka.move(71);
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(4);
        zofka.penDown();
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(90);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(135);
        zofka.move(150);
        zofka.turnLeft(45);
        zofka.move(25);
        zofka.turnRight(180);
        zofka.move(25);
        zofka.turnRight(90);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);

        //konec prasatka




    }



    public static void main(String[] args) {
        new HlavniProgram().start();}
}