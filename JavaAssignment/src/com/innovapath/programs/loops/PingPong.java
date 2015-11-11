package com.innovapath.programs.loops;

public class PingPong {

	public static void main(String[] args) {
		int n=25;
		if(n%3==0 && n%5==0)
		{
			System.out.println("PingPong");
		}else if(n%3==0)
		{
			System.out.println("Ping");
		}else if(n%5==0)
		{
			System.out.println("Pong");
		}else
		{
			System.out.println(n);
		}
	}

}
