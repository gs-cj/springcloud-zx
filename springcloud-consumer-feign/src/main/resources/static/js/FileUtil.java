package com.jk.songxj.utils;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import sun.misc.BASE64Encoder;

/**
 * 
 * <pre>
 * 项目名称：ssh-student    
 * 类名称：FileUtil    
 * 类描述：    文件上传工具类
 * 创建人：Huanglt huanglitai@sina.cn    
 * 创建时间：2016年3月1日 下午4:19:50    
 * 修改人：Huanglt huanglitai@sina.cn     
 * 修改时间：2016年3月1日 下午4:19:50    
 * 修改备注：       
 * &#64;version
 * </pre>
 */
public class FileUtil {
	
	
	/**
	 * 
	 * 方法: binaryToBase64Str <br>
	 * 描述: 二进制转换base64字符串 <br>
	 * 作者: Teacher song<br>
	 * 时间: 2017-4-8 上午11:39:03
	 * @param bytes
	 * @return
	 */
	public static String binaryToBase64Str(byte[] bytes){
		return new BASE64Encoder().encodeBuffer(bytes).trim();
	}
	
	/**
	 * 
	 * 方法: base64 <br>
	 * 描述: 文件转换二进制 <br>
	 * 作者: Teacher song<br>
	 * 时间: 2017-4-8 上午11:13:57
	 * @param img
	 * @return
	 * @throws IOException
	 */
	public static byte[] base64(File img) throws IOException {
		BufferedImage bi = ImageIO.read(img);    
		ByteArrayOutputStream baos = new ByteArrayOutputStream();    
		ImageIO.write(bi, "jpg", baos);    
		byte[] bytes = baos.toByteArray();   
		System.out.println(bytes);
//		String trim = new BASE64Encoder().encodeBuffer(bytes).trim();
		return bytes;
	}
		/**
	 * 上传文件方法
	 * @param file 上传的文件
	 * @param request request对象
	 * @return
	 */
	public static String FileUpload(MultipartFile file, HttpServletRequest request){
		
		//保存文件的目标目录
		String savePath = request.getRealPath("/");
//		String savePath = request.getSession().getServletContext().getRealPath(url);
		
		//获取源文件后缀名称
		//12345.jpg
		int suffixIndex = file.getOriginalFilename().lastIndexOf(".");
		//  .jpg
		String suffixName = file.getOriginalFilename().substring(suffixIndex);
		
		//生成新的文件名称，原因：防止文件名称一样后者上传的文件会覆盖前者上传的文件（前提是文件名称必须一样并且在用一个目录下）
		//生成新的文件名称，保证文件名称唯一有两种方法：
		// 	  1.通过UUID实现文件名称唯一 （UUID会生成32位字母+数字唯一的一个字符串）
		//	  2.通过时间戳现文件名称唯一  （时间戳是毫秒级时间 时间会一直往上加，生成13位数字）注意只有java生成13位 其他则是10位比如oracle、mysql、php
		//  获取时间戳
		//long currentTimeMillis = System.currentTimeMillis();
		//System.out.println(currentTimeMillis);
		
		String newFileName = UUID.randomUUID().toString().replace("-", "") + suffixName;
		
		//检测目标目录是否存在
		File targetFile = new File(savePath, newFileName);
		if(!targetFile.exists()){
			//创建目标目录
			targetFile.mkdirs();
		}
		
		try {
			// 使用transferTo（dest）方法将上传文件写到服务器上指定的文件。
			file.transferTo(targetFile);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newFileName;
	}
	
	/**
	 * <pre>
	 * fileUpload(文件上传)   
	 * 创建人：Huanglt huanglitai@sina.cn    
	 * 创建时间：2016年3月31日 上午10:05:59    
	 * 修改人：Huanglt huanglitai@sina.cn     
	 * 修改时间：2016年3月31日 上午10:05:59    
	 * 修改备注： 
	 * &#64;param srcFile 文件
	 * &#64;param srcFileName 文件名称
	 * &#64;param path 路径
	 * &#64;return
	 * </pre>
	 */
	public static String fileUpload(File srcFile, String srcFileName, String path) {
		// 文件上传
		FileInputStream is = null;
		FileOutputStream os = null;
		String newFilName = null;
		try {
			// 读取源文件创建读取流
			is = new FileInputStream(srcFile);
			// 创建新文件 创建写入流
			// 后缀
			String hz = srcFileName.substring(srcFileName.lastIndexOf("."));
			newFilName = UUID.randomUUID() + hz;
			// 新文件路径(如果文件夹不存在 则创建)
			File pathFile = new File(path);
			if (!pathFile.exists()) {
				pathFile.mkdirs();
			}
			// 创建新的文件
			File newFile = new File(path + "\\" + newFilName);
			// 写入流
			os = new FileOutputStream(newFile);
			// 循环写入
			int b = is.read();
			while (b != -1) {
				os.write(b);
				b = is.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {// 如果写入流不为null 则关闭
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {// 如果读取流不为null 则关闭
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return newFilName;
	}

	/**
	 * <pre>
	 * fileDownLoad(文件下载)   
	 * 创建人：Huanglt huanglitai@sina.cn    
	 * 创建时间：2016年3月31日 下午12:39:11    
	 * 修改人：Huanglt huanglitai@sina.cn     
	 * 修改时间：2016年3月31日 下午12:39:11    
	 * 修改备注： 
	 * &#64;param request
	 * &#64;param response
	 * &#64;param fileName
	 * </pre>
	 */
	public static void fileDownLoad(HttpServletRequest request, HttpServletResponse response, String fileName) {
		InputStream is = null;// 文件读取流
		OutputStream os = null;// 文件输出流
		BufferedInputStream bis = null;// 文件读取缓冲流;
		BufferedOutputStream bos = null;// 文件输出缓冲流;
		try {
			is = new FileInputStream(request.getRealPath("/")+ fileName);// 读取文件
			bis = new BufferedInputStream(is);// 文件读取缓冲流;
			os = response.getOutputStream();// 重点突出输出到浏览器
			bos = new BufferedOutputStream(os);
			// 解决浏览器兼容问题
			if (request.getHeader("User-Agent").toLowerCase().indexOf("firefox") > 0) {
				fileName = new String(fileName.getBytes("GB2312"), "ISO-8859-1");
			} else {
				// 对文件名进行编码处理中文问题
				fileName = java.net.URLEncoder.encode(fileName, "UTF-8");// 处理中文文件名的问题
				fileName = new String(fileName.getBytes("UTF-8"), "GBK");// 处理中文文件名的问题
			}

			response.reset();
			response.setContentType("application/x-msdownload");/// 不同类型的文件对应不同的MIME类型
			// inline在浏览器中直接显示，不提示用户下载
			// attachment弹出对话框，提示用户进行下载保存本地
			// 默认为inline方式
			response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
			// svn
			//
			byte[] b = new byte[4096];// 缓冲区
			int s = 0;
			while ((s = bis.read(b)) != -1) {
				bos.write(b, 0, s);
				bos.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (bos != null) {
					bos.flush();
					bos.close();
					bos = null;
				}

				if (os != null) {
					os.flush();
					os.close();
					os = null;
				}

				if (bis != null) {
					bis.close();
					bis = null;
				}
				if (is != null) {
					is.close();
					is = null;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
