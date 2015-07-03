package com.acn.codedecodeservice.client;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CodeDecodeClient
 */
@WebServlet("/CodeDecodeClient")
public class CodeDecodeClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Object obj;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CodeDecodeClient() {
        super();
        
        // TODO Auto-generated constructor stub
    }
    
    public void init(){
    	System.out.println("inside init");
    	obj = CodeDecodeServiceUtil.getUnmarshalObject("from");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("Output", obj);
		getServletContext().getRequestDispatcher("/mypage.html").forward(request, response);
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		// TODO Auto-generated method stub
	}

}
