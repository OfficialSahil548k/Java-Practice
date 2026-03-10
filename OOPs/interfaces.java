package OOPs;

public class interfaces {
    public static void main(String[] args){
        Rook r = new Rook();
        r.move();

        Student s = new Student();
        s.m_marks();
        s.p_marks();
    }
}

interface chessPlayer{
    void move();
}

class Queen implements chessPlayer{
    public void move(){
        System.out.println("up, down, right, left, diagonal(in all four direction)");
    }
}

class Rook implements chessPlayer{
    public void move(){
        System.out.println("up, down, right, left");
    }
}

class Pawn implements chessPlayer{
    public void move(){
        System.out.println("straight, diagonal(front....only during takedowns)");
    }
}

class King implements chessPlayer{
    public void move(){
        System.out.println("one step in all direction");
    }
}

interface Mathematics{
    void m_marks();
}

interface Physics{
    void p_marks();
}

class Student implements Mathematics, Physics{
    public void m_marks(){
        System.out.println("mathematics : 96. ");
    }

    public void p_marks(){
        System.out.println("physics : 87. ");
    }
}