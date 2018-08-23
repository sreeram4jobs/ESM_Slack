package com.nano.pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.StringJoiner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.mysql.cj.xdevapi.JsonArray;

@RestController
public class ControllerClass {
	
	
@Autowired	
public DAOInterface  daoser;	
	
public 	NanoCartCategories  anan;
List<NanoCartCategories>	list;
	//http://ec2-13-126-39-134.ap-south-1.compute.amazonaws.com://NanocartFolder
	
   // private static String UPLOADED_FOLDER = "http://ec2-13-126-39-134.ap-south-1.compute.amazonaws.com:/NanocartFolder/";//C://Users//lenovo//eclipse-workspace//
private static String UPLOADED_FOLDER = "$ aws s3 ls s3://NanocartFolder/";//C://Users//lenovo//eclipse-workspace//


    
    
@RequestMapping(value="/aws" ,method=RequestMethod.POST)
 public String getdata(HttpServletRequest   req,HttpServletResponse    res,@RequestParam("files")MultipartFile[] files ,@ModelAttribute("name")Category  name ) {
			
			  System.out.println(name);
			  for (MultipartFile file : files) {
String    filepath=file.getOriginalFilename();
		            if (file.isEmpty()) {
		                continue; //next pls
		            }

			  StringJoiner sj = new StringJoiner(" , ");
		            
		        for (MultipartFile file1 : files) {

		            if (file1.isEmpty()) {
		                continue; //next pls
		            }
//
		            try {

		                byte[] bytes = file.getBytes();
		                Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
		                Files.write(path, bytes);

		                sj.add(file.getOriginalFilename());

		            } catch (IOException e) {
		                e.printStackTrace();
		            }

        }

//		        String uploadedFileName = sj.toString();
//		        if (StringUtils.isEmpty(uploadedFileName)) {
//		            redirectAttributes.addFlashAttribute("message", 
//		                        "Please select a file to upload");
//		        } else {
//		            redirectAttributes.addFlashAttribute("message", 
//		                        "You successfully uploaded '" + uploadedFileName + "'");
//		        }

		  }



			  return "hi";
		  }
		  
		  
		  
		  @RequestMapping(value="/doUpload",method=RequestMethod.POST)
		  public String getdata12(HttpServletRequest  req,HttpServletResponse  res,@RequestParam("files")MultipartFile[] files ,@ModelAttribute("name")Category  name ) {
			
			  
			  System.out.println(name);

			  for (MultipartFile file : files) {
				System.out.println(file.getOriginalFilename());
						            if (file.isEmpty()) {
						                continue; //next pls
						            }
			  }
			  
			  
			  return "hi";
		  }


//@RequestMapping(value="/category",method=RequestMethod.POST)		  
//public ResponseBody  insertCategorydata(HttpServletRequest  req,HttpServletResponse  res) {
//	
//	
//
//	
//	String category=req.getParameter("name");
//	
//List<NanoCartCategories>	list=daoser.getCategoryByCategoryName(category);
//	JsonArray  array=new JsonArray();
//	
//	for(  list: anan)
//	
//	
//	return ;
//}

		  
@RequestMapping(value="/uploadfilesankar/",method=RequestMethod.POST   )
public @ResponseBody  String getdata(@RequestParam(value = "file",required=true)  MultipartFile[]  file) {
			//System.out.println(name);
			 System.out.println(file); 
			  
			 
			 
			 
			  return "Sankar Project";
		  }
		  
		  
		  
		  
	@RequestMapping(value="/sankar" , method = RequestMethod.GET   )	  
public @ResponseBody List<NanoCartCategories> getdata(@RequestParam  String name) {
		List<NanoCartCategories>  list=daoser.getCategoryByCategoryName(name);

		System.out.println(list);
		
return  list;
	  
	}
		  		  
@RequestMapping(value="/sankar123",method=RequestMethod.POST)
	public @ResponseBody  String  insertdata(@RequestParam("files")MultipartFile[] files,@ModelAttribute("sankar") Sankar sankar,HttpServletRequest  req,HttpServletResponse  res     ) {
	
		System.out.println(sankar);
		for(MultipartFile  file1:files) {
			System.out.println(file1.getOriginalFilename());
		}
		return "data is inserted successfully";
		
		
	}


}
		  
		  
		  
		  
		 
		  
		  
		  
		  
		
	
		  
	