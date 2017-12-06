package com.cwl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cwl.entity.Client;
import com.cwl.service.ClientServce;
import com.cwl.serviceImp.ClientServiceImp;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ClientServce cs=new ClientServiceImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("op");
		
		if("insert".equalsIgnoreCase(op)) {
			insert(request,response);
		}else if("select".equalsIgnoreCase(op)) {
			select(request,response);
		}else if("select1".equalsIgnoreCase(op)) {
			select1(request,response);
		}else if("selectByMail".equalsIgnoreCase(op)) {
			selectByMail(request,response);
		}else if("selectAllClient".equalsIgnoreCase(op)) {
			selectAllClient(request,response);
		}else if("selectByTel".equalsIgnoreCase(op)) {
			selectByTel(request,response);
		}else if("delete".equalsIgnoreCase(op)) {
			delete(request,response);
		}
	}
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cids=request.getParameter("cid");
		int cid=(cids==null?0:Integer.parseInt(cids));
		
		boolean flag=cs.deleteClient(cid);
		request.setAttribute("flag", flag);
		if(flag) {
			request.getRequestDispatcher("/ClientServlet?op=selectAllClient").forward(request, response);
		}
		
	}

	private void selectByTel(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String tel=request.getParameter("tel");
		
		Client client=cs.selectByTelphone(tel);
		
		if(client==null) {
			response.getWriter().write("0");
		}
	}

	private void selectAllClient(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		List<Client> list=cs.selectAllClient();
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("ShowClient.jsp").forward(request, response);
		
	}
	private void selectByMail(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String mail=request.getParameter("email");
		
		Client client=cs.selectByMail(mail);
		
		if(client==null) {
			response.getWriter().write("0");
		}
	}

	private void select1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name=request.getParameter("username");

		Client client=cs.seletctClient1(name);
		
		if(client == null) {
			response.getWriter().write("0");
		}
	}

	private void select(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String tel=request.getParameter("username");
		String pass=request.getParameter("password");
		Client client=new Client();
		
		client.setCtel(tel);
		client.setCpass(pass);
		
		boolean flag=cs.selectClient(client);
		if(flag) {
			//request.getRequestDispatcher("/index.jsp").forward(request, response);
			response.getWriter().write("true");
			
		}
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String mail = request.getParameter("mail");
		String tel = request.getParameter("tel");
		String pass = request.getParameter("pass");
	
		Client client=new Client();
		client.setCname(user);
		client.setCmail(mail);
		client.setCtel(tel);
		client.setCpass(pass);
		
		boolean flag=cs.insertClient(client);
		
		if(flag) {
			request.getRequestDispatcher("/entry.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
