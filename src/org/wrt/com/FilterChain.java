package org.wrt.com;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

	private List<Filter> filters = new ArrayList<Filter>();
	
	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}
	
	@Override
	public String doFilter(String str) {
		
		for(Filter f : filters) {
			str = f.doFilter(str);
		}
		return str;
	}

}
