package com.cwl.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.cwl.entity.Flower;
import com.cwl.service.FlowerService;
import com.cwl.serviceImp.FlowerServiceImp;

/**
 * Servlet implementation class FlowerServlet
 */
@WebServlet("/FlowerServlet")
public class FlowerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	FlowerService fs=new FlowerServiceImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlowerServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("op");
		String op2=request.getParameter("op2");
		
		if(op2 != null) {
			selectAllFlower(request,response);
		}
		if(op==null) {
			selectAllFlower(request,response);
		}else if("selectAllFlower".equalsIgnoreCase(op)) {
			selectAllFlower(request,response);
		}else if("update".equalsIgnoreCase(op)) {
			update(request,response);
		}else if("update2".equalsIgnoreCase(op)) {
			update2(request,response);
		}else if("insert".equalsIgnoreCase(op)) {
			insert(request,response);
		}else if("delete".equalsIgnoreCase(op)) {
			delete(request,response);
		}
	
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fids=request.getParameter("fid");
		int fid=(fids==null?0:Integer.parseInt(fids));
			
		boolean flag=fs.deleteFlower(fid);
		
		if(flag) {
			request.getRequestDispatcher("/FlowerServlet?op2=change").forward(request, response);
		}
		
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void update2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fids=request.getParameter("fid");
		int fid=(fids==null?0:Integer.parseInt(fids));
		String fname=request.getParameter("fname");
		String fprice=request.getParameter("fprice");
		String fgroup=request.getParameter("fgroup");
		String fnums=request.getParameter("fnum");
		int fnum=(fnums==null?0:Integer.parseInt(fnums));
		String fnote=request.getParameter("fnote");
		String ftids=request.getParameter("ftid");
		int ftid=(ftids==null?0:Integer.parseInt(ftids));
		
		Flower flower=new Flower();
		
		flower.setFid(fid);
		flower.setFname(fname);
		flower.setFprice(fprice);
		flower.setFgroup(fgroup);
		flower.setFnum(fnum);
		flower.setFnote(fnote);
		flower.setFtid(ftid);
		
		boolean flag=fs.updateFlower(flower);

		if(flag) {
			request.getRequestDispatcher("/FlowerServlet?op2=change").forward(request, response);
		}
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fids=request.getParameter("fid");
		int fid=(fids==null?0:Integer.parseInt(fids));
			
		Flower flower=fs.selectFlower(fid);
		request.setAttribute("flower", flower);
		request.getRequestDispatcher("UpdateFlower.jsp").forward(request, response);
	}

	private void selectAllFlower(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Flower> list=fs.selectAllFlower();
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("ShowFlower.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
