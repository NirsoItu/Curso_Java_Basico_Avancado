package com.inovationone.restfullspringboot.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class JavaFilter implements Filter {

    // Classe logger para saber quando entrou e saiu no fluxo da aplicação
    private Logger logger = LoggerFactory.getLogger(JavaFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("Chegou no portão do castelo");
        HttpServletRequest req = (HttpServletRequest) request;
        Enumeration<String> headersNames = req.getHeaderNames();
        Map<String, String> mapHeaders = Collections.list(headersNames)
                .stream()
                .collect(Collectors.toMap(it-> it, req::getHeader));
        if(mapHeaders.get("authorization") != null && mapHeaders.get("authorization").equals("salve")) {
            chain.doFilter(request, response);
        }else {
            HttpServletResponse resp = (HttpServletResponse) response;
            resp.sendError(403);
        }
        logger.info("Saiu do portão do castelo");
    }
}
