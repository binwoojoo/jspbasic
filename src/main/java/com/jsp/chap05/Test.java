package com.jsp.chap05;

public class Test {
    public static void main(String[] args) {
        JdbcBasic jdbc = new JdbcBasic();

//        jdbc.insert(new Person(99,"이상혁",28));
//        jdbc.insert(new Person(200,"이찬희",27));
//        jdbc.insert(new Person(300,"최익현",58));

//        jdbc.delete(200);
//        jdbc.delete(99);

//        jdbc.update(100,"최형배",42);
        jdbc.findAll();
    }
}
