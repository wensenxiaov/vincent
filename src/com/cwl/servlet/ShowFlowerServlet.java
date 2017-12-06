package com.cwl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cwl.entity.Flower;
import com.cwl.service.FlowerService;
import com.cwl.serviceImp.FlowerServiceImp;

/**
 * Servlet implementation class ShowFlowerServlet
 */
@WebServlet("/ShowFlowerServlet")
public class ShowFlowerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	FlowerService fs=new FlowerServiceImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowFlowerServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("op");
		
			if("selectFresh".equalsIgnoreCase(op)) {
				selectFresh(request,response);
			}else if("selectForever".equalsIgnoreCase(op)) {
				selectForever(request,response);
			}else if("selectJew".equalsIgnoreCase(op)) {
				selectJew(request,response);
			}else if("selectDec".equalsIgnoreCase(op)) {
				selectDec(request,response);
			}
		
	
	}
	private void selectDec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Flower> list=fs.selectAllFlower();
		
		request.getSession().setAttribute("list", list);
		
		request.getRequestDispatcher("/Dec.jsp").forward(request, response);	
		
	}

	private void selectJew(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Flower> list=fs.selectAllFlower();
		
		request.getSession().setAttribute("list", list);
		
		request.getRequestDispatcher("/Jew.jsp").forward(request, response);	
		
	}

	private void selectForever(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Flower> list=fs.selectAllFlower();
		
		request.getSession().setAttribute("list", list);
		
		request.getRequestDispatcher("/foreverRose.jsp").forward(request, response);	
		
	}

	private void selectFresh(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Flower> list=fs.selectAllFlower();
		
		request.getSession().setAttribute("list", list);
		
		request.getRequestDispatcher("/flowRose.jsp").forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
