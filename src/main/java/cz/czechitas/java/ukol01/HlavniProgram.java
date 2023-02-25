package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

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

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
