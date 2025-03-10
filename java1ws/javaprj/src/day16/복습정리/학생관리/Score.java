package day16.복습정리.학생관리;

 

public class Score    {
    private String name; // 학생 이름
    private int studentId; // 학생 ID
    private int score; // 학생 점수

    // 생성자
    public Score(String name, int studentId, int score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    // getter 및 setter 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // 객체 정보를 문자열로 반환
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + studentId + ", Score: " + score;
    }
}

