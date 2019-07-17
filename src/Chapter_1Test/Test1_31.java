package Chapter_1Test;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
 
import java.awt.*;
 
 
public class Test1_31 {
    static class Point {
        double x;
        double y;
 
        public Point(double x, double y) {
            super();
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        Point[] points = new Point[N];
        double angle = 360.0 / N;
        StdDraw.circle(0.5, 0.5, 0.5);
        StdDraw.setPenRadius(0.05);
        for (int i = 0; i < N; i++) {
            points[i] = new Point(0.5 + 0.5 * Math.cos(angle * i * Math.PI / 180),
                    0.5 + 0.5 * Math.sin(angle * i * Math.PI / 180));
            StdDraw.point(points[i].x, points[i].y);
        }
        StdDraw.setPenColor(Color.GRAY);
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (StdRandom.bernoulli(p)) {
                    StdDraw.line(points[i].x, points[i].y, points[j].x, points[j].y);
                }
            }
        }
        //该for循环将每个点两两按照StdRandom.bernoulli(p)的结果选择是否连接
        //如果StdRandom.bernoulli(p)为true，则分别将这两个点的坐标作为StdDraw.line()的参数画出一条连接线段
    }
}