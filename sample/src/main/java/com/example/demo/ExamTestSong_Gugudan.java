package com.example.demo;

public class ExamTestSong_Gugudan {

	public void ExamPleSong() {
		int a = 0;
		int b = 2;
		int result = a + b;
		System.out.println(result);
	}
	
	public void ExamPleSong1() {
		boolean song = false;
		int a = (int)Math.random()*10 + 1;
		while(song) {
			System.out.println("주사위 게임에 오신걸 환영합니다");
			switch (a) {
			case 1: {
				System.out.println("오늘의 행운의 숫자는" + a);
				break;
			}
			default:
				song = true;
			}
		}
		
	}
}
