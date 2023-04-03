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

    int squareX = checkPoint.getX()*checkPoint.getX();
    int squareY = checkPoint.getY()*checkPoint.getY();
  }
}
