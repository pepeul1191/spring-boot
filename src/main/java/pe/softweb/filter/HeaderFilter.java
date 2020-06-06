package pe.softweb.filter;

import javax.servlet.Filter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import java.io.IOException;
import org.springframework.stereotype.Component;

@Component
public class HeaderFilter implements Filter{
  @Override
   public void destroy() {}

   @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain) 
      throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) request;
    MutableHttpServletRequest mutableRequest = new MutableHttpServletRequest(req);
    mutableRequest.putHeader("Server", "Ubuntu, Jetty");
    chain.doFilter(mutableRequest, response);
    filterchain.doFilter(request, response);
  }

   @Override
   public void init(FilterConfig filterconfig) throws ServletException {}
}