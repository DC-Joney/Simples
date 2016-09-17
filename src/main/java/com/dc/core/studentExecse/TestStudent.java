package com.dc.core.studentExecse;

/**
 * Created by Administrator on 2016/9/10.
 */
public class TestStudent {
    public  static  class Student{
        private int number;
        private  int state;
        private  int score;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public Student(int number, int state, int score) {
            this.number = number;
            this.state = state;
            this.score = score;
        }
    }

//    public static void main(String[] args) {
//        Student[]student=new Student[20];
//        for (int i = 0; i < student.length; i++) {
//            int state=(int)(Math.random()*2)+1;
//            double score=Math.round();
//            student[i]=new Student(i,state);
//
//        }
//    }
}
