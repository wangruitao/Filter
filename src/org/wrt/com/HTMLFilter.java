package org.wrt.com;

public class HTMLFilter implements Filter {

	
	
	public String doFilter(String str) {
		
		return str.replaceAll("<", "[").replaceAll(">", "]");
	}

}
