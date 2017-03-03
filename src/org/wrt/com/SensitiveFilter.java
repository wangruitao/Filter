package org.wrt.com;

public class SensitiveFilter implements Filter {

	public String doFilter(String str) {
		return str.replaceAll("院长", "**").replaceAll("委员", "**");
	}

}
