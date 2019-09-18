package com.self.test.controller;

import java.io.File;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.self.test.response.OcrResponse;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@RestController
@RequestMapping("/api.ocr")
public class Ocr {
	
//	public static void main(String[] args) {
//		
////        File imageFile = new File("C://Users//SachithT.LOITL-ITSE39//Pictures//price.jpg");
////       
////        String path = imageFile.toString();
////        
////        OcrEngine ocr = new OcrEngine();
////        
////        ocr.setImage(ImageStream.fromFile(path));
////        
////        CorrectionFilters filters = new CorrectionFilters();
////        filters.add(new MedianFilter(6));
////        
////        try {
////			
////        	if(ocr.process()) {
////        		System.out.println(ocr.getText());
////        	}
////        	
////		} catch (Exception e) {
////			
////			e.printStackTrace();
////		}
//		ocr();
//    }
	
	@RequestMapping(value = "/image/recognition" , method = RequestMethod.GET)
	public OcrResponse imageRecognition () {
		
		Tesseract tesseract = new Tesseract();
		
		 try {
			 
			tesseract.setDatapath("D://AJAX//tessdata");
			String text = tesseract.doOCR(new File("C://Users//SachithT.LOITL-ITSE39//Pictures//SampleNumbers_r.jpg"));		
			System.out.print(text);
			
			OcrResponse ocrResponse = new OcrResponse();
			ocrResponse.setResponse(text);
			
			return ocrResponse;
				
		 } catch (TesseractException e) {		
			e.printStackTrace();
			return null;
		 }
	}
	
//	 public static void main(String []args) {
//		 Tesseract tesseract = new Tesseract();
//		 try {
//			tesseract.setDatapath("D://AJAX//tessdata");
//			String text = tesseract.doOCR(new File("C://Users//SachithT.LOITL-ITSE39//Pictures//SampleNumbers_r.jpg"));		
//			System.out.print(text);
//		 } catch (TesseractException e) {		
//			e.printStackTrace();
//		}
//	 }

}
