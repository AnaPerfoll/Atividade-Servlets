package com.example.projeto3;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/ciclo-de-vida")
public class CicloDeVidaServlet extends HelloServlet {

    @Override
    public void init() {
        //invocar algum recurso
        //[e invocado apenas uma vez!
        System.out.println("Invocou o método init");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Invocou o método service");
    }

    @Override
    public void destroy() {
        //liberar recursos usados
        System.out.println("Invocou o método destroy");
    }
}
