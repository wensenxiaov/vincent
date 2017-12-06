package com.cwl.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cwl.entity.Cart;
import com.cwl.entity.Flower;
import com.cwl.service.CartServce;
import com.cwl.service.ClientServce;
import com.cwl.service.FlowerService;
import com.cwl.serviceImp.CartServceImp;
import com.cwl.serviceImp.ClientServiceImp;
import com.cwl.serviceImp.FlowerServiceImp;
import com.sun.corba.se.spi.orbutil.fsm.FSM;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	FlowerService fs=new FlowerServiceImp();
	CartServce cs=new CartServceImp();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//;
		
		String op=request.getParameter("op");
		
		if(op==null) {
			insertCart(request,response);
		}else if("delete".equalsIgnoreCase(op)) {
			delete(request,response);
		}else if("select".equalsIgnoreCase(op)) {
			select(request,response);
		}else if("deleteCart".equalsIgnoreCase(op)) {
			deleteCart(request, response);
		}
		
		
	
	}

	private void deleteCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cfids=request.getParameter("cfid");
		int cfid=(cfids==null?0:Integer.parseInt(cfids));
		String name=request.getParameter("user");
		
		boolean flag=cs.deleteCart(cfid);
		
		if(flag) {
			request.getRequestDispatcher("CartServlet?op=select").forward(request, response);
		}
	}

	private void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String name=request.getParameter("user");
		
		List<Cart> list=cs.getAllCart(name);
		
		request.getSession().setAttribute("list", list);
		
		request.getRequestDispatcher("/ShoppingCart.jsp").forward(request, response);
	
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String cname=request.getParameter("cname");
		
		boolean flag=cs.deleteAllCart(cname);
		
		if(flag) {
			request.getRequestDispatcher("CartServlet?op=select").forward(request, response);
		}else {
			request.getRequestDispatcher("/ShoppingCart.jsp").forward(request, response);
			
		}
	}

	

	private void insertCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fids = request.getParameter("fid");
		int fid=(fids==null?0:Integer.parseInt(fids));
		
		String name=request.getParameter("user");
		
		if(name=="") {
			request.getRequestDispatcher("/entry.html").forward(request, response);
		}
		String count1=request.getParameter("count");
		int count=(count1==null?0:Integer.parseInt(count1));
		
		int count2=0;
		Flower flower = fs.selectFlower(fid);
		
		Cart cart=cs.getCart(fid, name);
		boolean flag=false;
		if(cart==null) {
			flag=cs.insertCart(fid,count,name);
		}else {
			int count3=cart.getCcount();
			count2=count+count3;
			flag=cs.updateCart(fid, count2, name);
		}
		if(flag) {
			request.getRequestDispatcher("CartServlet?op=select").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);               
	}

}
