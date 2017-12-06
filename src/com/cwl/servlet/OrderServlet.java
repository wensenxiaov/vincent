package com.cwl.servlet;
import com.cwl.entity.Cart;
import com.cwl.entity.Flower;
import com.cwl.entity.Order;
import com.cwl.service.CartServce;
import com.cwl.service.ClientServce;
import com.cwl.service.FlowerService;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.cwl.service.OrderService;
import com.cwl.serviceImp.FlowerServiceImp;
import com.cwl.serviceImp.OrderServiceImp;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	OrderService os=new OrderServiceImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("op");
		
		
		if(op==null) {
			selectOrder(request,response);
		}else if("insert".equalsIgnoreCase(op)) {
			insert(request,response);
		}else if("select".equalsIgnoreCase(op)) {
			select(request,response);
		}else if("update".equalsIgnoreCase(op)) {
			update(request,response);
		}else if("updatemes".equalsIgnoreCase(op)) {
			updatemes(request,response);
		}else if("haha".equalsIgnoreCase(op)) {
			selectOrder(request,response);
		}else if("selectByName".equalsIgnoreCase(op)) {
			selectByName(request,response);
		}
	
	}

	private void selectByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String oname=request.getParameter("user");
		
		List<Order> list=os.selectByName(oname);
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("OrderShow.jsp").forward(request, response);;
	
	}

	private void updatemes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String odids=request.getParameter("odid");
		int odid=(odids==null?0:Integer.parseInt(odids));
		String omood=request.getParameter("omood");
		
		Order order=new Order();
		
		order.setOdid(odid);
		order.setOmood(omood);
		
		boolean flag=os.updateOrder(omood,odid);

		if(flag) {
			request.getRequestDispatcher("OrderServlet?op=haha").forward(request, response);
		}
	}


	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String odids=request.getParameter("odid");
		int odid=(odids==null?0:Integer.parseInt(odids));
			
		Order order=os.selectOrder(odid);
		request.setAttribute("order", order);
		request.getRequestDispatcher("/UpdateOrder.jsp").forward(request, response);
	
	}

	private void selectOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Order> list=os.selectOrder();
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("ShowOrder.jsp").forward(request, response);;
	
	}

	private void select(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String date=request.getParameter("date");
		
		List<Order> list=os.selectAllOrder(date);
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("OrderShow.jsp").forward(request, response);;
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Cart> list=(List<Cart>)request.getSession().getAttribute("list");
		
		String name=request.getParameter("user");
		
		String orname=request.getParameter("shouhuo");
		
		String otel=request.getParameter("shouhuotel");
		
		String oaddr=request.getParameter("shouhuoaddr");
		
		String ocode=request.getParameter("shouhuoyoubian");
		
		FlowerService fs=new FlowerServiceImp();
		Order order=null;
		double sum=0;
		String clear=null;

    	long time = System.currentTimeMillis();
    	Date date=new Date();
    	SimpleDateFormat sdf=new SimpleDateFormat("yyMMddhhmmssS");
    	
		boolean flag=false;
		for(Cart c: list){
    	Flower f=fs.selectFlower(c.getCfid());
    	int price=Integer.parseInt(f.getFprice());
    	sum = (price*c.getCcount());
			
    	int oid=f.getFid();

    	
    	
    	order=new Order();
    	
    	order.setOid(oid);
    	
    	order.setOname(name);
    	order.setOrname(orname);
    	order.setOtel(otel);
    	order.setOaddr(oaddr);
    	order.setOcode(ocode);
    	order.setOprice(sum);
    	order.setOid(oid);
    	order.setOdate(sdf.format(date));
    	order.setOmood("待发货");
    	
    	flag=os.insertOrder(order);
    	
    	
		}if(flag) {
    		request.getRequestDispatcher("OrderServlet?op=select&date="+(sdf.format(date))).forward(request, response);
    	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
