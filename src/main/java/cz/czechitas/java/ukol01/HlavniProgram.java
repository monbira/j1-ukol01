package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        zofka.setPenColor(Color.black);
        zofka.setPenWidth(7);

        /*zofka.setLocation(100,150);
        nakresliPrasatko(zofka);

        zofka.setLocation(350,150);
        zofka.turnRight(105);
        nakresliOctagon(zofka);

        zofka.setLocation(500,120);
        nakresliKolecko(zofka);

        zofka.setLocation(700,120);
        zofka.turnLeft(45);
        nakresliSlunicko(zofka);*/

        zofka.setLocation(200, 60);
        nakresliSlunicko(zofka);

        zofka.setLocation(100, 200);
        zofka.turnRight(90);
        for (int i = 0; i < 5; i++) {
            nakresliDomecek(zofka);
            zofka.turnLeft(45);
            zofka.penUp();
            zofka.move(50);
            zofka.penDown();
        }
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.penDown();
        zofka.turnLeft(180);
        nakresliDomecek(zofka);

        zofka.setLocation(100,450);
        zofka.turnLeft(45);
        nakresliDomecek(zofka);

        zofka.setLocation(400, 530);
        zofka.turnLeft(135);
        nakresliPrasatko(zofka);


        zofka.setLocation(100,750);
        zofka.turnRight(150);

        nakresliM(zofka);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.penDown();

        nakresliO(zofka);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliN(zofka);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliI(zofka);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliK(zofka);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(140);
        zofka.penDown();
        zofka.turnRight(70);

        nakresliA(zofka);

    }

    private static void nakresliA(Turtle zofka) {
        zofka.move(130);
        zofka.turnRight(180);
        zofka.move(130);
        zofka.turnLeft(140);
        zofka.move(130);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(70);
        zofka.move(50);
    }

    private static void nakresliK(Turtle zofka) {
        zofka.move(60);
        zofka.turnRight(135);
        zofka.move(83);
        zofka.turnLeft(180);
        zofka.move(83);
        zofka.turnRight(90);
        zofka.move(83);
        zofka.turnLeft(180);
        zofka.move(83);
        zofka.turnRight(135);
        zofka.move(60);
    }

    private static void nakresliI(Turtle zofka) {
        zofka.move(120);
    }

    private static void nakresliN(Turtle zofka) {
        zofka.move(120);
        zofka.turnRight(145);
        zofka.move(150);
        zofka.turnLeft(145);
        zofka.move(120);
    }

    private static void nakresliO(Turtle zofka) {
        for (int i = 0; i < 18; i++) {
            zofka.turnRight(20);
            zofka.move(21);
        }
    }

    private static void nakresliM(Turtle zofka) {
        zofka.move(120);
        zofka.turnRight(145);
        zofka.move(80);
        zofka.turnLeft(110);
        zofka.move(80);
        zofka.turnRight(145);
        zofka.move(120);
    }

    private static void nakresliDomecek(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(70.7106781);
        zofka.turnRight(90);
        zofka.move(70.7106781);
    }

    private static void nakresliSlunicko(Turtle zofka) {
        for (int i = 0; i < 12; i++) {
            zofka.turnLeft(90);
            zofka.move(15);
            zofka.turnLeft(180);
            zofka.move(15);
            zofka.turnLeft(90);
            for (int j = 0; j < 2; j++) {
                zofka.turnRight(15);
                zofka.move(10);
            }

        }
    }

    private static void nakresliKolecko(Turtle zofka) {
        for (int i = 0; i < 18; i++) {
            zofka.turnRight(20);
            zofka.move(10);
        }
    }

    private static void nakresliOctagon(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.move(40);
            zofka.turnRight(45);

        }
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