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
import com.cwl.entity.Type;
import com.cwl.service.FlowerService;
import com.cwl.serviceImp.FlowerServiceImp;

/**
 * Servlet implementation class InsertFlowerServlet
 */
@WebServlet("/InsertFlowerServlet")
public class InsertFlowerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FlowerService fs=new FlowerServiceImp();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertFlowerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//创建一个磁盘文件条目工厂对象
				DiskFileItemFactory factory=new DiskFileItemFactory();
				
				ServletFileUpload fileUpload=new ServletFileUpload(factory);
				//设置文件最大规格
				fileUpload.setFileSizeMax(10*1024*1024);

				String fimgs=null;
				String fimg1=null;
				String fimg2=null;
				String fimg3=null;
				String fimg4=null;
				String fimg5=null;

				
				try {
					List<FileItem> list=fileUpload.parseRequest(request);

					Flower flower=new Flower();
					Type type=new Type();
					
					for(FileItem item : list) {
						//判断文件是否为表单域
						if(item.isFormField()) {
							String fieldName = item.getFieldName();
							
							if("fid".equalsIgnoreCase(fieldName)) {
								String fids=item.getString("utf-8");
								int fid=(fids==null?0:Integer.parseInt(fids));
								flower.setFid(fid);
							}
							if("fname".equalsIgnoreCase(fieldName)) {
								String fname=item.getString("utf-8");
								flower.setFname(fname);
							}
							if("fprice".equalsIgnoreCase(fieldName)) {
								String fprice=item.getString("utf-8");
								flower.setFprice(fprice);
							}
							if("ftid".equalsIgnoreCase(fieldName)) {
								String ftids=item.getString("utf-8");
								int ftid=(ftids==null?0:Integer.parseInt(ftids));
								flower.setFtid(ftid);
							}
							if("fgroup".equalsIgnoreCase(fieldName)) {
								String fgroup=item.getString("utf-8");
								flower.setFgroup(fgroup);
							}
							if("fcolor".equalsIgnoreCase(fieldName)) {
								String fcolor=item.getString("utf-8");
								flower.setFcolor(fcolor);
							}
							if("fstyle".equalsIgnoreCase(fieldName)) {
								String fstyle=item.getString("utf-8");
								flower.setFstyle(fstyle);
							}
							if("fnote".equalsIgnoreCase(fieldName)) {
								String fnote=item.getString("utf-8");
								flower.setFnote(fnote);
							}
							if("fnum".equalsIgnoreCase(fieldName)) {
								String fnums=item.getString("utf-8");
								int fnum=(fnums==null?0:Integer.parseInt(fnums));
								flower.setFnum(fnum);
							}
							if("fbrand".equalsIgnoreCase(fieldName)) {
								String fbrand=item.getString("utf-8");
								flower.setFbrand(fbrand);
							}
							if("ftype".equalsIgnoreCase(fieldName)) {
								String ftype=item.getString("utf-8");
								type.setTname(ftype);
								flower.setFtype(type);
							}
							
							
						}else { //文件域  上传文件
							//获取文件名
							String fieldName = item.getFieldName();

							if("fimgs".equalsIgnoreCase(fieldName)) {
								String fileName = item.getName();

								File f=new File(fileName);
								
								fimgs=f.getName();	
								
								String path=request.getRealPath("/images")+File.separator+fimgs;

								File file=new File(path);
								
								item.write(file); 
								
								flower.setFimgs(fileName);
							
							}
							if("fimg1".equalsIgnoreCase(fieldName)) {
								String fileName = item.getName();

								File f=new File(fileName);
								
								fimg1=f.getName();	
								
								String path=request.getRealPath("/images")+File.separator+fimg1;

								File file=new File(path);
								
								item.write(file);
							
								
								flower.setFimg1(fileName);
							
							}
							if("fimg2".equalsIgnoreCase(fieldName)) {
								String fileName = item.getName();

								File f=new File(fileName);
								
								fimg2=f.getName();	
								
								String path=request.getRealPath("/images")+File.separator+fimg2;

								File file=new File(path);
								
								item.write(file);
								
								flower.setFimg2(fileName);
							
							}
							if("fimg3".equalsIgnoreCase(fieldName)) {
								String fileName = item.getName();

								File f=new File(fileName);
								
								fimg3=f.getName();	
								
								String path=request.getRealPath("/images")+File.separator+fimg3;

								File file=new File(path);
								
								item.write(file);
								
								flower.setFimg3(fileName);
							
							}
							if("fimg4".equalsIgnoreCase(fieldName)) {
								String fileName = item.getName();

								File f=new File(fileName);
								
								fimg4=f.getName();	
								
								String path=request.getRealPath("/images")+File.separator+fimg4;

								File file=new File(path);
								
								item.write(file);
								
								flower.setFimg4(fileName);
							
							}
							if("fimg5".equalsIgnoreCase(fieldName)) {
								String fileName = item.getName();

								File f=new File(fileName);
								
								fimg5=f.getName();	
								
								String path=request.getRealPath("/images")+File.separator+fimg5;

								File file=new File(path);
								
								item.write(file);
								
								flower.setFimg5(fileName);
							
							}
						}
						
					}
					boolean flag=fs.insertFlower(flower);
					
					if(flag) {
						request.getRequestDispatcher("/FlowerServlet?op=selectAllFlower").forward(request, response);
					}
					
				} catch (FileUploadException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
