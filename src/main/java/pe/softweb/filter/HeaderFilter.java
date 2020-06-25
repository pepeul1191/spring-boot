package pe.softweb.filter;

import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.FilterChain;
import java.io.IOException;
import org.springframework.stereotype.Component;

@Component
public class HeaderFilter extends OncePerRequestFilter
{
  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
    throws ServletException, IOException 
  {
    response.addHeader("Server", "Ubuntu, Jetty");
    response.addHeader("X-Application-Context", "");
    filterChain.doFilter(request, response);
  }
}