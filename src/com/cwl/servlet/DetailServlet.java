package com.cwl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cwl.entity.Flower;
import com.cwl.service.FlowerService;
import com.cwl.serviceImp.FlowerServiceImp;

/**
 * Servlet implementation class DetailServlet
 */
@WebServlet("/DetailServlet")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	FlowerService fs=new FlowerServiceImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				String op=request.getParameter("op");
				
				if(op==null) {
					selectFlower(request,response);
				}else if("insertCart".equalsIgnoreCase(op)) {
					insertCart(request,response);
				}
		
	}

	

	private void insertCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fids=request.getParameter("fid");
		int fid=(fids==null?0:Integer.parseInt(fids));
		
		Flower flower=fs.selectFlower(fid);
		
		request.setAttribute("flower",flower);
		request.getRequestDispatcher("/ShoppingCart.jsp").forward(request, response);

	
	}

	private void selectFlower(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fids=request.getParameter("fid");
		int fid=(fids==null?0:Integer.parseInt(fids));
		
		Flower flower=fs.selectFlower(fid);
		
		request.setAttribute("flower",flower);
		request.getRequestDispatcher("/detail.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
