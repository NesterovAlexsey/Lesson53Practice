import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача 2** (не обязательно)
//Получите от пользователя радиус окружности.
//
// По введённым координатам точки определите, попадает ли она внутрь,
// на границу или вне окружности с указанным радиусом и центром в точке O (0, 0).
//
public class CircleRadiusDeterminator {
  public static void main(String[] args) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Введите радиус окружности");
    int rad = Integer.parseInt(read.readLine());

    Point checkPoint = Point.read(read);

    int squareX = (int) Math.pow(checkPoint.getX(), 2);
    int squareY = (int) Math.pow(checkPoint.getY(), 2);
    int squareR = (int) Math.pow(rad, 2);

    if ((squareX + squareY) < squareR) {
      System.out.println("Введенная точка находиться внутри окружности");
    } else if ((squareX + squareY) > squareR) {
      System.out.println("Введенная точка находиться вне окружности");
    } else {
      System.out.println("Введенная точка лежит на окружности");
    }
  }
}
