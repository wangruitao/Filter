package org.wrt.com;

public class Main {

	public static void main(String[] args) {
		String str = "大家好，<html>，副院长，总局局长，国务委员，相信很多人都看过一部电影";
		
//		Filter[] filters = {new HTMLFilter(), new SensitiveFilter()};
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());
		System.out.println(fc.doFilter(str));
	}

}
