package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        nakresliPrasatko(zofka);


    }

    private static void nakresliPrasatko(Turtle zofka) {
        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(45);
        zofka.move(120);
        zofka.turnRight(90);
        zofka.move(100);

        zofka.turnLeft(40);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(100);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);

        zofka.turnLeft(130);
        zofka.move(120);

        zofka.turnLeft(130);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(100);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);

        zofka.turnLeft(40);
        zofka.move(100);

        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnRight(75);
        for (int i = 0; i < 15; i++) {
            zofka.move(7);
            zofka.turnLeft(20);
        }
        for (int i = 0; i < 15; i++) {
            zofka.move(3);
            zofka.turnLeft(20);
        }
        for (int i = 0; i < 5; i++) {
            zofka.move(7);
            zofka.turnLeft(15);
        }

    }


    public static void main(String[] args) {
        new HlavniProgram().start();}
}