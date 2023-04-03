
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
    System.out.println(checkPoint);
  }

}
