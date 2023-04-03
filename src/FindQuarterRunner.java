
//Решите следующие задачи с использованием класса Point из классной работы.
//
//    Задача 1* (не обязательно)
//    По введённым координатам точки определите, в какой координатной четверти (или на какой оси)
//    она находится.
//
//    Четверти нумеруются следующим образом
//        y
//        ^
//    II  |  I
//    ------------> x
//    III |  IV
//        |

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindQuarterRunner {
  public static void main(String[] args) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    Point checkPoint = Point.read(read);

    int multiplication = (int) Math.signum(checkPoint.getX() * checkPoint.getY());

    switch (multiplication) {
      case 1:
        if (checkPoint.getX() > 0) {
          System.out.println("Точка находиться в первом квадрате");
        } else {
          System.out.println("Точка находиться в третьем квадрате");
        }
        break;
      case -1:
        if (checkPoint.getX() > 0) {
          System.out.println("Точка находиться в четвертом квадрате");
        } else {
          System.out.println("Точка находиться во втором квадрате");
        }
        break;
      case 0:
        if (checkPoint.getX() == 0 && (checkPoint.getY() == 0)) {
          System.out.println("Точка находиться в центре координат");
        } else if (checkPoint.getX() == 0) {
          System.out.println("Точка лежит на оси x");
        } else {
          System.out.println("Точка лежит на оси y");
        }
    }

    System.out.println(checkPoint);
  }

}
