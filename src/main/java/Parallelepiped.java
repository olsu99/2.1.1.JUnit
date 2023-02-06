public class Parallelepiped {

    public int perimeter(int a, int b, int c) {
        return 4 * (a + b + c);
    }

    public int area(int a, int b, int c) {
        return 2 * (a * b + a * c + b * c);
    }

    public int volume(int a, int b, int c) {
        return a * b * c;
    }
}
